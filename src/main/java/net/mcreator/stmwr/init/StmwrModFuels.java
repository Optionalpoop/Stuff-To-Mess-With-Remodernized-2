
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
		else if (itemstack.getItem() == StmwrModBlocks.ASH.get().asItem())
			event.setBurnTime(20);
		else if (itemstack.getItem() == StmwrModItems.URANIUM_DUST.get())
			event.setBurnTime(4800);
		else if (itemstack.getItem() == StmwrModBlocks.URANIUM_BLOCK.get().asItem())
			event.setBurnTime(43200);
		else if (itemstack.getItem() == StmwrModItems.URANIUM_FUEL_ROD.get())
			event.setBurnTime(129600);
		else if (itemstack.getItem() == StmwrModBlocks.WISHING_TREE_PLANKS.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == StmwrModBlocks.WISHING_TREE_LOG.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == StmwrModBlocks.WISHING_TREE_WOOD.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StmwrModBlocks.FIREWOOD_WOOD.get().asItem())
			event.setBurnTime(3200);
		else if (itemstack.getItem() == StmwrModBlocks.FIREWOOD_LOG.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StmwrModBlocks.FIREWOOD_PLANKS.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StmwrModBlocks.CANDY_WOOD.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == StmwrModBlocks.CANDY_LOG.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == StmwrModBlocks.CANDY_PLANKS.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == StmwrModItems.FIREBLOOD.get())
			event.setBurnTime(1728000);
	}
}
