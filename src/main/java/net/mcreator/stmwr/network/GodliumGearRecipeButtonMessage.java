
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.GodliumGearRecipeMenu;
import net.mcreator.stmwr.procedures.ToToolsAndArmorProcedure;
import net.mcreator.stmwr.procedures.ToGodliumSwordRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumShovelRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumPickaxeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumLeggingsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumHoeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumHelmetRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumChestplateRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumBootsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToGodliumAxeRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GodliumGearRecipeButtonMessage {
	private final int buttonID, x, y, z;

	public GodliumGearRecipeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GodliumGearRecipeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GodliumGearRecipeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GodliumGearRecipeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = GodliumGearRecipeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToToolsAndArmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToGodliumHelmetRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToGodliumChestplateRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToGodliumLeggingsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToGodliumBootsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToGodliumSwordRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToGodliumPickaxeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToGodliumShovelRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToGodliumHoeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ToGodliumAxeRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(GodliumGearRecipeButtonMessage.class, GodliumGearRecipeButtonMessage::buffer, GodliumGearRecipeButtonMessage::new, GodliumGearRecipeButtonMessage::handler);
	}
}
