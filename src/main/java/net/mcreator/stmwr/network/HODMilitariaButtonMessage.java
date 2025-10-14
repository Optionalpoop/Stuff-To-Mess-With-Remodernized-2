
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.HODMilitariaMenu;
import net.mcreator.stmwr.procedures.ToHODTheTimelessProcedure;
import net.mcreator.stmwr.procedures.ToHODIrradiatedPigProcedure;
import net.mcreator.stmwr.procedures.ToHODIrradiatedCowProcedure;
import net.mcreator.stmwr.procedures.ToHODIrradiatedChickenProcedure;
import net.mcreator.stmwr.procedures.ToHODGoolingProcedure;
import net.mcreator.stmwr.procedures.ToHODCategoriesProcedure;
import net.mcreator.stmwr.procedures.ToHODAncientWizardProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HODMilitariaButtonMessage {
	private final int buttonID, x, y, z;

	public HODMilitariaButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HODMilitariaButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HODMilitariaButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HODMilitariaButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HODMilitariaMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToHODCategoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToHODIrradiatedPigProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToHODIrradiatedCowProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToHODIrradiatedChickenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToHODAncientWizardProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToHODTheTimelessProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToHODGoolingProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(HODMilitariaButtonMessage.class, HODMilitariaButtonMessage::buffer, HODMilitariaButtonMessage::new, HODMilitariaButtonMessage::handler);
	}
}
