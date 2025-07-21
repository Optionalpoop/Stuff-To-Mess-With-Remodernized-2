
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.AOTTotemsP1Menu;
import net.mcreator.stmwr.procedures.ToTotemOfWaterBreathingRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfTheSteveCowRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfStrengthRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfSpeedRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfRegenerationRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfNightVisionRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfLevitationRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfJumpBoostRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfHealthBoostRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfHasteRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfGamblingRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfFireResistanceRecipeProcedure;
import net.mcreator.stmwr.procedures.ToTotemOfDolphinsGraceRecipeProcedure;
import net.mcreator.stmwr.procedures.ToAOTHomePageProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AOTTotemsP1ButtonMessage {
	private final int buttonID, x, y, z;

	public AOTTotemsP1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AOTTotemsP1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AOTTotemsP1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AOTTotemsP1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = AOTTotemsP1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 1) {

			ToAOTHomePageProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToTotemOfFireResistanceRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToTotemOfWaterBreathingRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToTotemOfSpeedRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToTotemOfHealthBoostRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToTotemOfJumpBoostRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToTotemOfNightVisionRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToTotemOfHasteRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ToTotemOfStrengthRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			ToTotemOfDolphinsGraceRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			ToTotemOfLevitationRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			ToTotemOfRegenerationRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			ToTotemOfGamblingRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 14) {

			ToTotemOfTheSteveCowRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(AOTTotemsP1ButtonMessage.class, AOTTotemsP1ButtonMessage::buffer, AOTTotemsP1ButtonMessage::new, AOTTotemsP1ButtonMessage::handler);
	}
}
