
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.ColdsteelGearRecipeMenu;
import net.mcreator.stmwr.procedures.ToToolsAndArmorProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelSwordRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelShovelRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelPickaxeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelLeggingsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelHoeRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelHelmetRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelChestplateRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelBootsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToColdsteelAxeRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColdsteelGearRecipeButtonMessage {
	private final int buttonID, x, y, z;

	public ColdsteelGearRecipeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ColdsteelGearRecipeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ColdsteelGearRecipeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ColdsteelGearRecipeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ColdsteelGearRecipeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToToolsAndArmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToColdsteelHelmetRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToColdsteelChestplateRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToColdsteelLeggingsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToColdsteelBootsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToColdsteelSwordRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToColdsteelPickaxeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToColdsteelAxeRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToColdsteelShovelRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			ToColdsteelHoeRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(ColdsteelGearRecipeButtonMessage.class, ColdsteelGearRecipeButtonMessage::buffer, ColdsteelGearRecipeButtonMessage::new, ColdsteelGearRecipeButtonMessage::handler);
	}
}
