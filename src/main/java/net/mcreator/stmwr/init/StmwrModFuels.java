
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class StmwrModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == StmwrModBlocks.FROSTY_WOOD.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StmwrModBlocks.FROSTY_LOG.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == StmwrModBlocks.FROSTY_PLANKS.get().asItem())
			event.setBurnTime(600);
	}
}
