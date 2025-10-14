
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.BOLPage1Menu;
import net.mcreator.stmwr.procedures.ToEyeOfTimeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToEyeOfTheSteveCowRecipeProcedure;
import net.mcreator.stmwr.procedures.ToCreationOrbRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBOLHomePageProcedure;
import net.mcreator.stmwr.procedures.ToActivatingT2TotemsProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOLPage1ButtonMessage {
	private final int buttonID, x, y, z;

	public BOLPage1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BOLPage1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BOLPage1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BOLPage1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = BOLPage1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToBOLHomePageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToActivatingT2TotemsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToCreationOrbRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToEyeOfTheSteveCowRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToEyeOfTimeRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(BOLPage1ButtonMessage.class, BOLPage1ButtonMessage::buffer, BOLPage1ButtonMessage::new, BOLPage1ButtonMessage::handler);
	}
}
