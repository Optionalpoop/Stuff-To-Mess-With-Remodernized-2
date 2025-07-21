
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.HODSteveCowLandMenu;
import net.mcreator.stmwr.procedures.ToHODSteveCowProcedure;
import net.mcreator.stmwr.procedures.ToHODPikachuProcedure;
import net.mcreator.stmwr.procedures.ToHODLightningWizardProcedure;
import net.mcreator.stmwr.procedures.ToHODLightningCultistProcedure;
import net.mcreator.stmwr.procedures.ToHODLesserWizardProcedure;
import net.mcreator.stmwr.procedures.ToHODGiantSteveCowProcedure;
import net.mcreator.stmwr.procedures.ToHODFrombieProcedure;
import net.mcreator.stmwr.procedures.ToHODCrusherProcedure;
import net.mcreator.stmwr.procedures.ToHODCategoriesProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HODSteveCowLandButtonMessage {
	private final int buttonID, x, y, z;

	public HODSteveCowLandButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HODSteveCowLandButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HODSteveCowLandButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HODSteveCowLandButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = HODSteveCowLandMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToHODCategoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToHODSteveCowProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToHODFrombieProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToHODPikachuProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToHODCrusherProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToHODLesserWizardProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToHODLightningCultistProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToHODLightningWizardProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ToHODGiantSteveCowProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(HODSteveCowLandButtonMessage.class, HODSteveCowLandButtonMessage::buffer, HODSteveCowLandButtonMessage::new, HODSteveCowLandButtonMessage::handler);
	}
}
