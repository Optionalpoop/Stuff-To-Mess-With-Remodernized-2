
package net.mcreator.stmwr.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.ManupediaRecipesMenu;
import net.mcreator.stmwr.procedures.ToSpringsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToRodsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToPlatesRecipeProcedure;
import net.mcreator.stmwr.procedures.ToNailsRecipeProcedure;
import net.mcreator.stmwr.procedures.ToManupediaHomeProcedure;
import net.mcreator.stmwr.procedures.ToCogsRecipeProcedure;
import net.mcreator.stmwr.StmwrMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ManupediaRecipesButtonMessage {
	private final int buttonID, x, y, z;

	public ManupediaRecipesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ManupediaRecipesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ManupediaRecipesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ManupediaRecipesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ManupediaRecipesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ToManupediaHomeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ToNailsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ToRodsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			ToPlatesRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ToCogsRecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			ToSpringsRecipeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StmwrMod.addNetworkMessage(ManupediaRecipesButtonMessage.class, ManupediaRecipesButtonMessage::buffer, ManupediaRecipesButtonMessage::new, ManupediaRecipesButtonMessage::handler);
	}
}
