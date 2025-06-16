
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.BlazedGearRecipeMenu;
import net.mcreator.stmwr.procedures.ToToolsAndArmorProcedure;
import net.mcreator.stmwr.procedures.ToBlazedSwordRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedShovelRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedPickaxeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedLeggingsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedHoeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedHelmetRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedChestplateRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedBootsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToBlazedAxeRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlazedGearRecipeButtonMessage {
	private final int buttonID, x, y, z;

	public BlazedGearRecipeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BlazedGearRecipeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BlazedGearRecipeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BlazedGearRecipeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = BlazedGearRecipeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToToolsAndArmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToBlazedHelmetRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToBlazedChestplateRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToBlazedLeggingsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToBlazedBootsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToBlazedSwordRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToBlazedAxeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToBlazedPickaxeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToBlazedShovelRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ToBlazedHoeRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(BlazedGearRecipeButtonMessage.class, BlazedGearRecipeButtonMessage::buffer, BlazedGearRecipeButtonMessage::new, BlazedGearRecipeButtonMessage::handler);
	}
}
