
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.BlocksPageMenu;
import net.mcreator.stmwr.procedures.ToStopstoneRecipeProcedure;
import net.mcreator.stmwr.procedures.ToSpeedstoneRecipeProcedure;
import net.mcreator.stmwr.procedures.ToFlamingStorageCubeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToDupestoneRecipeProcedure;
import net.mcreator.stmwr.procedures.ToCategoriesProcedure;
import net.mcreator.stmwr.procedures.ToBlazingPlasticRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlocksPageButtonMessage {
	private final int buttonID, x, y, z;

	public BlocksPageButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BlocksPageButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BlocksPageButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BlocksPageButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BlocksPageMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToCategoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToBlazingPlasticRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToFlamingStorageCubeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToStopstoneRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToSpeedstoneRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToDupestoneRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(BlocksPageButtonMessage.class, BlocksPageButtonMessage::buffer, BlocksPageButtonMessage::new, BlocksPageButtonMessage::handler);
	}
}
