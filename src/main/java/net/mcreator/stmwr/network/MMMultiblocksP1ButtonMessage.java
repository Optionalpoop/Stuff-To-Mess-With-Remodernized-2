
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.MMMultiblocksP1Menu;
import net.mcreator.stmwr.procedures.ToUraniumProcessingPlantMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToUraniumHydroponicsMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTARDISMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToSoulManipulatorMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToRitualCircleMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToRadiationRemovalPlantMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToManufacturingPlantMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToMMHomePageProcedure;
import net.mcreator.stmwr.procedures.ToLaboratoryMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToDoomforgeMultiblockRecipeProcedure;
import net.mcreator.stmwr.procedures.ToConcreteMixerMultiblockRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MMMultiblocksP1ButtonMessage {
	private final int buttonID, x, y, z;

	public MMMultiblocksP1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MMMultiblocksP1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MMMultiblocksP1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MMMultiblocksP1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MMMultiblocksP1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToMMHomePageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToDoomforgeMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToLaboratoryMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToManufacturingPlantMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToRitualCircleMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToConcreteMixerMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToTARDISMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToUraniumProcessingPlantMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ToRadiationRemovalPlantMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			ToUraniumHydroponicsMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			ToSoulManipulatorMultiblockRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(MMMultiblocksP1ButtonMessage.class, MMMultiblocksP1ButtonMessage::buffer, MMMultiblocksP1ButtonMessage::new, MMMultiblocksP1ButtonMessage::handler);
	}
}
