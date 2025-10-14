
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.ModularGearRecipesMenu;
import net.mcreator.stmwr.procedures.ToToolsAndArmorProcedure;
import net.mcreator.stmwr.procedures.ToReinforcedArmsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToPoweredLeggingsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToNightVisionGogglesRecipeProcedure;
import net.mcreator.stmwr.procedures.ToModularLeggingsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToModularHelmetRecipeProcedure;
import net.mcreator.stmwr.procedures.ToModularChestplateRecipeProcedure;
import net.mcreator.stmwr.procedures.ToModularBootsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToLongFallBootsRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModularGearRecipesButtonMessage {
	private final int buttonID, x, y, z;

	public ModularGearRecipesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ModularGearRecipesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ModularGearRecipesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ModularGearRecipesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ModularGearRecipesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToToolsAndArmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ToModularHelmetRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToModularChestplateRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToModularLeggingsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToModularBootsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToNightVisionGogglesRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToReinforcedArmsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			ToPoweredLeggingsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			ToLongFallBootsRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(ModularGearRecipesButtonMessage.class, ModularGearRecipesButtonMessage::buffer, ModularGearRecipesButtonMessage::new, ModularGearRecipesButtonMessage::handler);
	}
}
