
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.ItemsPageMenu;
import net.mcreator.stmwr.procedures.ToVortexManipulatorRecipeProcedure;
import net.mcreator.stmwr.procedures.ToUraniumFuelRodRecipeProcedure;
import net.mcreator.stmwr.procedures.ToSoulShardRecipeProcedure;
import net.mcreator.stmwr.procedures.ToPowercellRecipeProcedure;
import net.mcreator.stmwr.procedures.ToPortableOvenRecipeProcedure;
import net.mcreator.stmwr.procedures.ToPortableCrucibleRecipeProcedure;
import net.mcreator.stmwr.procedures.ToExtremePocketCellRecipeProcedure;
import net.mcreator.stmwr.procedures.ToCategoriesProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemsPageButtonMessage {
	private final int buttonID, x, y, z;

	public ItemsPageButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ItemsPageButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ItemsPageButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ItemsPageButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ItemsPageMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToCategoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToUraniumFuelRodRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToSoulShardRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToPowercellRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToVortexManipulatorRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToPortableCrucibleRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToPortableOvenRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToExtremePocketCellRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(ItemsPageButtonMessage.class, ItemsPageButtonMessage::buffer, ItemsPageButtonMessage::new, ItemsPageButtonMessage::handler);
	}
}
