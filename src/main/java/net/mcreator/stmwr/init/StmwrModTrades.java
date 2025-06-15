
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class StmwrModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == StmwrModVillagerProfessions.CHEF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(Items.BREAD, 8), 8, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(Blocks.WHEAT, 16), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(Items.SUSPICIOUS_STEW), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModBlocks.KITCHEN.get()), 8, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(Items.SUGAR, 32), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 3),

					new ItemStack(Items.ROTTEN_FLESH, 64), 8, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(Blocks.CAKE), 8, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(Items.GOLDEN_CARROT, 4), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.CHEESE.get(), 8), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.CHEESE_WHEEL.get(), 4), 12, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.STRING_CHEESE.get(), 8), 8, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.SLICED_BREAD.get(), 12), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.PEANUT.get(), 8), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.TOMATO.get(), 8), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.WOODEN_KNIFE.get()), 4, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.CHICKEN_NUGGET.get()), 4, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.COOK_BOOK.get()), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.PEPPERONI.get(), 8), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.PIZZA.get()), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.DOUGH.get(), 8), 8, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.TORTILLA.get()), 12, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.PIZZA_SLICE.get(), 4), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.GROUND_BEEF.get(), 8), 16, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.SAUSAGE.get(), 8), 12, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.CHOCOLATE.get(), 4), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.TACO.get(), 2), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.TACO_SHELL.get(), 6), 12, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.POTATO_CHIPS.get(), 8), 16, 5, 0.05f));
		}
	}
}
