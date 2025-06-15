
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.stmwr.StmwrMod;

public class StmwrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StmwrMod.MODID);
	public static final RegistryObject<CreativeModeTab> STUFF_TO_MESS_WITH_REMODERNIZED = REGISTRY.register("stuff_to_mess_with_remodernized",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stmwr.stuff_to_mess_with_remodernized")).icon(() -> new ItemStack(Blocks.AMETHYST_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(StmwrModItems.WOODEN_KNIFE.get());
				tabData.accept(StmwrModBlocks.KITCHEN.get().asItem());
				tabData.accept(StmwrModItems.NOOBISH_TRIAL_COIN.get());
				tabData.accept(StmwrModItems.HAPPY_TRIAL_COIN.get());
				tabData.accept(StmwrModItems.ALMIGHTY_TRIAL_COIN.get());
				tabData.accept(StmwrModItems.PEANUT.get());
				tabData.accept(StmwrModBlocks.PEANUT_PLANT.get().asItem());
				tabData.accept(StmwrModItems.TOMATO.get());
				tabData.accept(StmwrModBlocks.TOMATO_PLANT.get().asItem());
				tabData.accept(StmwrModItems.SLICED_BREAD.get());
				tabData.accept(StmwrModItems.CHEESE.get());
				tabData.accept(StmwrModItems.CHEESE_WHEEL.get());
				tabData.accept(StmwrModItems.STRING_CHEESE.get());
				tabData.accept(StmwrModItems.PEPPERONI.get());
				tabData.accept(StmwrModItems.PIZZA.get());
				tabData.accept(StmwrModItems.DOUGH.get());
				tabData.accept(StmwrModItems.TORTILLA.get());
				tabData.accept(StmwrModItems.PIZZA_SLICE.get());
				tabData.accept(StmwrModItems.GROUND_BEEF.get());
				tabData.accept(StmwrModItems.SAUSAGE.get());
				tabData.accept(StmwrModItems.CHOCOLATE.get());
				tabData.accept(StmwrModItems.TACO.get());
				tabData.accept(StmwrModItems.TACO_SHELL.get());
				tabData.accept(StmwrModItems.POTATO_CHIPS.get());
				tabData.accept(StmwrModItems.CHICKEN_NUGGET.get());
				tabData.accept(StmwrModItems.COOK_BOOK.get());
				tabData.accept(StmwrModItems.MAGICITE_DUST.get());
				tabData.accept(StmwrModBlocks.MAGICITE_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.MAGICITE_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.MAGIC_CARROT.get());
				tabData.accept(StmwrModItems.DIRT_NUGGET.get());
				tabData.accept(StmwrModItems.MAGICITE_HANDLE.get());
				tabData.accept(StmwrModItems.UNSPELLED_WAND.get());
				tabData.accept(StmwrModBlocks.MAGICIANS_WORKBENCH.get().asItem());
				tabData.accept(StmwrModBlocks.STORUM_ORE.get().asItem());
				tabData.accept(StmwrModItems.RAW_STORUM.get());
				tabData.accept(StmwrModBlocks.STORAGE_CUBE.get().asItem());
				tabData.accept(StmwrModItems.PLASTIC_CHUNK.get());
				tabData.accept(StmwrModBlocks.PLASTIC.get().asItem());
				tabData.accept(StmwrModItems.TOTEM_BASE.get());
				tabData.accept(StmwrModBlocks.FORGE.get().asItem());
				tabData.accept(StmwrModItems.FORGERS_GUIDE.get());
				tabData.accept(StmwrModItems.WOODEN_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.STONE_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.IRON_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.GOLD_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.DIAMOND_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.MAGICITE_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.STORUM_FORGING_HAMMER.get());
				tabData.accept(StmwrModItems.ALLIGATOR_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.ALLIGATOR_SCALE.get());
				tabData.accept(StmwrModItems.ALLIGATOR_TOOTH.get());
				tabData.accept(StmwrModItems.ALLIGATOR_KNIFE.get());
				tabData.accept(StmwrModBlocks.SPELLFORGE.get().asItem());
				tabData.accept(StmwrModItems.CODEX.get());
				tabData.accept(StmwrModItems.WIZARDS_SEA.get());
				tabData.accept(StmwrModItems.WIZARDS_SEA_WAND.get());
				tabData.accept(StmwrModItems.BLAZED_INGOT.get());
				tabData.accept(StmwrModBlocks.BLAZED_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.BLAZED_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.RAW_BLAZED_CHUNK.get());
			})

					.build());
}
