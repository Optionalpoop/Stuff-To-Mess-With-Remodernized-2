
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.stmwr.item.WoodenKnifeItem;
import net.mcreator.stmwr.item.WoodenForgingHammerItem;
import net.mcreator.stmwr.item.WizardsSeaWandItem;
import net.mcreator.stmwr.item.WizardsSeaItem;
import net.mcreator.stmwr.item.UnspelledWandItem;
import net.mcreator.stmwr.item.TotemBaseItem;
import net.mcreator.stmwr.item.TortillaItem;
import net.mcreator.stmwr.item.TomatoItem;
import net.mcreator.stmwr.item.TacoShellItem;
import net.mcreator.stmwr.item.TacoItem;
import net.mcreator.stmwr.item.StringCheeseItem;
import net.mcreator.stmwr.item.StorumItem;
import net.mcreator.stmwr.item.StorumForgingHammerItem;
import net.mcreator.stmwr.item.StoneForgingHammerItem;
import net.mcreator.stmwr.item.SlicedBreadItem;
import net.mcreator.stmwr.item.SausageItem;
import net.mcreator.stmwr.item.RawStorumItem;
import net.mcreator.stmwr.item.RawBlazedChunkItem;
import net.mcreator.stmwr.item.PotatoChipsItem;
import net.mcreator.stmwr.item.PlasticChunkItem;
import net.mcreator.stmwr.item.PizzaSliceItem;
import net.mcreator.stmwr.item.PizzaItem;
import net.mcreator.stmwr.item.PepperoniItem;
import net.mcreator.stmwr.item.PeanutItem;
import net.mcreator.stmwr.item.NoobishTrialCoinItem;
import net.mcreator.stmwr.item.MagiciteHandleItem;
import net.mcreator.stmwr.item.MagiciteForgingHammerItem;
import net.mcreator.stmwr.item.MagiciteDustItem;
import net.mcreator.stmwr.item.MagicCarrotItem;
import net.mcreator.stmwr.item.IronForgingHammerItem;
import net.mcreator.stmwr.item.HappyTrialCoinItem;
import net.mcreator.stmwr.item.GroundBeefItem;
import net.mcreator.stmwr.item.GoldForgingHammerItem;
import net.mcreator.stmwr.item.ForgersGuideItem;
import net.mcreator.stmwr.item.DoughItem;
import net.mcreator.stmwr.item.DirtNuggetItem;
import net.mcreator.stmwr.item.DiamondForgingHammerItem;
import net.mcreator.stmwr.item.CookBookItem;
import net.mcreator.stmwr.item.CodexItem;
import net.mcreator.stmwr.item.ChocolateItem;
import net.mcreator.stmwr.item.ChickenNuggetItem;
import net.mcreator.stmwr.item.CheeseWheelItem;
import net.mcreator.stmwr.item.CheeseItem;
import net.mcreator.stmwr.item.BlazedIngotItem;
import net.mcreator.stmwr.item.AlmightyTrialCoinItem;
import net.mcreator.stmwr.item.AlligatorToothItem;
import net.mcreator.stmwr.item.AlligatorScaleItem;
import net.mcreator.stmwr.item.AlligatorKnifeItem;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StmwrMod.MODID);
	public static final RegistryObject<Item> WOODEN_KNIFE = REGISTRY.register("wooden_knife", () -> new WoodenKnifeItem());
	public static final RegistryObject<Item> KITCHEN = block(StmwrModBlocks.KITCHEN);
	public static final RegistryObject<Item> NOOBISH_TRIAL_COIN = REGISTRY.register("noobish_trial_coin", () -> new NoobishTrialCoinItem());
	public static final RegistryObject<Item> HAPPY_TRIAL_COIN = REGISTRY.register("happy_trial_coin", () -> new HappyTrialCoinItem());
	public static final RegistryObject<Item> ALMIGHTY_TRIAL_COIN = REGISTRY.register("almighty_trial_coin", () -> new AlmightyTrialCoinItem());
	public static final RegistryObject<Item> PEANUT = REGISTRY.register("peanut", () -> new PeanutItem());
	public static final RegistryObject<Item> PEANUT_PLANT = block(StmwrModBlocks.PEANUT_PLANT);
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> TOMATO_PLANT = doubleBlock(StmwrModBlocks.TOMATO_PLANT);
	public static final RegistryObject<Item> SLICED_BREAD = REGISTRY.register("sliced_bread", () -> new SlicedBreadItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> CHEESE_WHEEL = REGISTRY.register("cheese_wheel", () -> new CheeseWheelItem());
	public static final RegistryObject<Item> STRING_CHEESE = REGISTRY.register("string_cheese", () -> new StringCheeseItem());
	public static final RegistryObject<Item> PEPPERONI = REGISTRY.register("pepperoni", () -> new PepperoniItem());
	public static final RegistryObject<Item> PIZZA = REGISTRY.register("pizza", () -> new PizzaItem());
	public static final RegistryObject<Item> DOUGH = REGISTRY.register("dough", () -> new DoughItem());
	public static final RegistryObject<Item> TORTILLA = REGISTRY.register("tortilla", () -> new TortillaItem());
	public static final RegistryObject<Item> PIZZA_SLICE = REGISTRY.register("pizza_slice", () -> new PizzaSliceItem());
	public static final RegistryObject<Item> GROUND_BEEF = REGISTRY.register("ground_beef", () -> new GroundBeefItem());
	public static final RegistryObject<Item> SAUSAGE = REGISTRY.register("sausage", () -> new SausageItem());
	public static final RegistryObject<Item> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateItem());
	public static final RegistryObject<Item> TACO = REGISTRY.register("taco", () -> new TacoItem());
	public static final RegistryObject<Item> TACO_SHELL = REGISTRY.register("taco_shell", () -> new TacoShellItem());
	public static final RegistryObject<Item> POTATO_CHIPS = REGISTRY.register("potato_chips", () -> new PotatoChipsItem());
	public static final RegistryObject<Item> CHICKEN_NUGGET = REGISTRY.register("chicken_nugget", () -> new ChickenNuggetItem());
	public static final RegistryObject<Item> COOK_BOOK = REGISTRY.register("cook_book", () -> new CookBookItem());
	public static final RegistryObject<Item> MAGICITE_DUST = REGISTRY.register("magicite_dust", () -> new MagiciteDustItem());
	public static final RegistryObject<Item> MAGICITE_ORE = block(StmwrModBlocks.MAGICITE_ORE);
	public static final RegistryObject<Item> MAGICITE_BLOCK = block(StmwrModBlocks.MAGICITE_BLOCK);
	public static final RegistryObject<Item> MAGIC_CARROT = REGISTRY.register("magic_carrot", () -> new MagicCarrotItem());
	public static final RegistryObject<Item> DIRT_NUGGET = REGISTRY.register("dirt_nugget", () -> new DirtNuggetItem());
	public static final RegistryObject<Item> MAGICITE_HANDLE = REGISTRY.register("magicite_handle", () -> new MagiciteHandleItem());
	public static final RegistryObject<Item> UNSPELLED_WAND = REGISTRY.register("unspelled_wand", () -> new UnspelledWandItem());
	public static final RegistryObject<Item> MAGICIANS_WORKBENCH = block(StmwrModBlocks.MAGICIANS_WORKBENCH);
	public static final RegistryObject<Item> STORUM = REGISTRY.register("storum", () -> new StorumItem());
	public static final RegistryObject<Item> STORUM_ORE = block(StmwrModBlocks.STORUM_ORE);
	public static final RegistryObject<Item> STORUM_BLOCK = block(StmwrModBlocks.STORUM_BLOCK);
	public static final RegistryObject<Item> RAW_STORUM = REGISTRY.register("raw_storum", () -> new RawStorumItem());
	public static final RegistryObject<Item> STORAGE_CUBE = block(StmwrModBlocks.STORAGE_CUBE);
	public static final RegistryObject<Item> PLASTIC_CHUNK = REGISTRY.register("plastic_chunk", () -> new PlasticChunkItem());
	public static final RegistryObject<Item> PLASTIC = block(StmwrModBlocks.PLASTIC);
	public static final RegistryObject<Item> TOTEM_BASE = REGISTRY.register("totem_base", () -> new TotemBaseItem());
	public static final RegistryObject<Item> FORGE = block(StmwrModBlocks.FORGE);
	public static final RegistryObject<Item> FORGERS_GUIDE = REGISTRY.register("forgers_guide", () -> new ForgersGuideItem());
	public static final RegistryObject<Item> WOODEN_FORGING_HAMMER = REGISTRY.register("wooden_forging_hammer", () -> new WoodenForgingHammerItem());
	public static final RegistryObject<Item> STONE_FORGING_HAMMER = REGISTRY.register("stone_forging_hammer", () -> new StoneForgingHammerItem());
	public static final RegistryObject<Item> IRON_FORGING_HAMMER = REGISTRY.register("iron_forging_hammer", () -> new IronForgingHammerItem());
	public static final RegistryObject<Item> GOLD_FORGING_HAMMER = REGISTRY.register("gold_forging_hammer", () -> new GoldForgingHammerItem());
	public static final RegistryObject<Item> DIAMOND_FORGING_HAMMER = REGISTRY.register("diamond_forging_hammer", () -> new DiamondForgingHammerItem());
	public static final RegistryObject<Item> MAGICITE_FORGING_HAMMER = REGISTRY.register("magicite_forging_hammer", () -> new MagiciteForgingHammerItem());
	public static final RegistryObject<Item> STORUM_FORGING_HAMMER = REGISTRY.register("storum_forging_hammer", () -> new StorumForgingHammerItem());
	public static final RegistryObject<Item> ALLIGATOR_SPAWN_EGG = REGISTRY.register("alligator_spawn_egg", () -> new ForgeSpawnEggItem(StmwrModEntities.ALLIGATOR, -16737997, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> ALLIGATOR_SCALE = REGISTRY.register("alligator_scale", () -> new AlligatorScaleItem());
	public static final RegistryObject<Item> ALLIGATOR_TOOTH = REGISTRY.register("alligator_tooth", () -> new AlligatorToothItem());
	public static final RegistryObject<Item> ALLIGATOR_KNIFE = REGISTRY.register("alligator_knife", () -> new AlligatorKnifeItem());
	public static final RegistryObject<Item> SPELLFORGE = block(StmwrModBlocks.SPELLFORGE);
	public static final RegistryObject<Item> CODEX = REGISTRY.register("codex", () -> new CodexItem());
	public static final RegistryObject<Item> WIZARDS_SEA = REGISTRY.register("wizards_sea", () -> new WizardsSeaItem());
	public static final RegistryObject<Item> WIZARDS_SEA_WAND = REGISTRY.register("wizards_sea_wand", () -> new WizardsSeaWandItem());
	public static final RegistryObject<Item> BLAZED_INGOT = REGISTRY.register("blazed_ingot", () -> new BlazedIngotItem());
	public static final RegistryObject<Item> BLAZED_ORE = block(StmwrModBlocks.BLAZED_ORE);
	public static final RegistryObject<Item> BLAZED_BLOCK = block(StmwrModBlocks.BLAZED_BLOCK);
	public static final RegistryObject<Item> RAW_BLAZED_CHUNK = REGISTRY.register("raw_blazed_chunk", () -> new RawBlazedChunkItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
