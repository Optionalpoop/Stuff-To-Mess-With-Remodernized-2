
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.stmwr.world.inventory.WizardsSeaRecipeMenu;
import net.mcreator.stmwr.world.inventory.TortillaRecipeMenu;
import net.mcreator.stmwr.world.inventory.ToolsAndArmorMenu;
import net.mcreator.stmwr.world.inventory.TacoShellRecipeMenu;
import net.mcreator.stmwr.world.inventory.TacoRecipeMenu;
import net.mcreator.stmwr.world.inventory.StorageCubeGUIMenu;
import net.mcreator.stmwr.world.inventory.SpellsP1Menu;
import net.mcreator.stmwr.world.inventory.SpellforgeGUIMenu;
import net.mcreator.stmwr.world.inventory.SausageRecipeMenu;
import net.mcreator.stmwr.world.inventory.PotatoChipsRecipeMenu;
import net.mcreator.stmwr.world.inventory.PizzaSliceRecipeMenu;
import net.mcreator.stmwr.world.inventory.PizzaRecipeMenu;
import net.mcreator.stmwr.world.inventory.PepperoniRecipeMenu;
import net.mcreator.stmwr.world.inventory.MagiciansWorkbenchGUIMenu;
import net.mcreator.stmwr.world.inventory.KitchenGUIMenu;
import net.mcreator.stmwr.world.inventory.HomePageMenu;
import net.mcreator.stmwr.world.inventory.GroundBeefRecipeMenu;
import net.mcreator.stmwr.world.inventory.ForgeGUIMenu;
import net.mcreator.stmwr.world.inventory.CookBookHomePageMenu;
import net.mcreator.stmwr.world.inventory.CodexHomePageMenu;
import net.mcreator.stmwr.world.inventory.ChocolateRecipeMenu;
import net.mcreator.stmwr.world.inventory.ChickenNuggetRecipeMenu;
import net.mcreator.stmwr.world.inventory.CheeseStickRecipeMenu;
import net.mcreator.stmwr.world.inventory.CategoriesMenu;
import net.mcreator.stmwr.world.inventory.BlocksPageMenu;
import net.mcreator.stmwr.world.inventory.AlligatorKnifeRecipeMenu;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StmwrMod.MODID);
	public static final RegistryObject<MenuType<KitchenGUIMenu>> KITCHEN_GUI = REGISTRY.register("kitchen_gui", () -> IForgeMenuType.create(KitchenGUIMenu::new));
	public static final RegistryObject<MenuType<CookBookHomePageMenu>> COOK_BOOK_HOME_PAGE = REGISTRY.register("cook_book_home_page", () -> IForgeMenuType.create(CookBookHomePageMenu::new));
	public static final RegistryObject<MenuType<ChickenNuggetRecipeMenu>> CHICKEN_NUGGET_RECIPE = REGISTRY.register("chicken_nugget_recipe", () -> IForgeMenuType.create(ChickenNuggetRecipeMenu::new));
	public static final RegistryObject<MenuType<PotatoChipsRecipeMenu>> POTATO_CHIPS_RECIPE = REGISTRY.register("potato_chips_recipe", () -> IForgeMenuType.create(PotatoChipsRecipeMenu::new));
	public static final RegistryObject<MenuType<TacoRecipeMenu>> TACO_RECIPE = REGISTRY.register("taco_recipe", () -> IForgeMenuType.create(TacoRecipeMenu::new));
	public static final RegistryObject<MenuType<TacoShellRecipeMenu>> TACO_SHELL_RECIPE = REGISTRY.register("taco_shell_recipe", () -> IForgeMenuType.create(TacoShellRecipeMenu::new));
	public static final RegistryObject<MenuType<ChocolateRecipeMenu>> CHOCOLATE_RECIPE = REGISTRY.register("chocolate_recipe", () -> IForgeMenuType.create(ChocolateRecipeMenu::new));
	public static final RegistryObject<MenuType<SausageRecipeMenu>> SAUSAGE_RECIPE = REGISTRY.register("sausage_recipe", () -> IForgeMenuType.create(SausageRecipeMenu::new));
	public static final RegistryObject<MenuType<GroundBeefRecipeMenu>> GROUND_BEEF_RECIPE = REGISTRY.register("ground_beef_recipe", () -> IForgeMenuType.create(GroundBeefRecipeMenu::new));
	public static final RegistryObject<MenuType<PizzaSliceRecipeMenu>> PIZZA_SLICE_RECIPE = REGISTRY.register("pizza_slice_recipe", () -> IForgeMenuType.create(PizzaSliceRecipeMenu::new));
	public static final RegistryObject<MenuType<TortillaRecipeMenu>> TORTILLA_RECIPE = REGISTRY.register("tortilla_recipe", () -> IForgeMenuType.create(TortillaRecipeMenu::new));
	public static final RegistryObject<MenuType<PizzaRecipeMenu>> PIZZA_RECIPE = REGISTRY.register("pizza_recipe", () -> IForgeMenuType.create(PizzaRecipeMenu::new));
	public static final RegistryObject<MenuType<PepperoniRecipeMenu>> PEPPERONI_RECIPE = REGISTRY.register("pepperoni_recipe", () -> IForgeMenuType.create(PepperoniRecipeMenu::new));
	public static final RegistryObject<MenuType<CheeseStickRecipeMenu>> CHEESE_STICK_RECIPE = REGISTRY.register("cheese_stick_recipe", () -> IForgeMenuType.create(CheeseStickRecipeMenu::new));
	public static final RegistryObject<MenuType<MagiciansWorkbenchGUIMenu>> MAGICIANS_WORKBENCH_GUI = REGISTRY.register("magicians_workbench_gui", () -> IForgeMenuType.create(MagiciansWorkbenchGUIMenu::new));
	public static final RegistryObject<MenuType<StorageCubeGUIMenu>> STORAGE_CUBE_GUI = REGISTRY.register("storage_cube_gui", () -> IForgeMenuType.create(StorageCubeGUIMenu::new));
	public static final RegistryObject<MenuType<ForgeGUIMenu>> FORGE_GUI = REGISTRY.register("forge_gui", () -> IForgeMenuType.create(ForgeGUIMenu::new));
	public static final RegistryObject<MenuType<HomePageMenu>> HOME_PAGE = REGISTRY.register("home_page", () -> IForgeMenuType.create(HomePageMenu::new));
	public static final RegistryObject<MenuType<CategoriesMenu>> CATEGORIES = REGISTRY.register("categories", () -> IForgeMenuType.create(CategoriesMenu::new));
	public static final RegistryObject<MenuType<ToolsAndArmorMenu>> TOOLS_AND_ARMOR = REGISTRY.register("tools_and_armor", () -> IForgeMenuType.create(ToolsAndArmorMenu::new));
	public static final RegistryObject<MenuType<BlocksPageMenu>> BLOCKS_PAGE = REGISTRY.register("blocks_page", () -> IForgeMenuType.create(BlocksPageMenu::new));
	public static final RegistryObject<MenuType<AlligatorKnifeRecipeMenu>> ALLIGATOR_KNIFE_RECIPE = REGISTRY.register("alligator_knife_recipe", () -> IForgeMenuType.create(AlligatorKnifeRecipeMenu::new));
	public static final RegistryObject<MenuType<SpellforgeGUIMenu>> SPELLFORGE_GUI = REGISTRY.register("spellforge_gui", () -> IForgeMenuType.create(SpellforgeGUIMenu::new));
	public static final RegistryObject<MenuType<CodexHomePageMenu>> CODEX_HOME_PAGE = REGISTRY.register("codex_home_page", () -> IForgeMenuType.create(CodexHomePageMenu::new));
	public static final RegistryObject<MenuType<SpellsP1Menu>> SPELLS_P_1 = REGISTRY.register("spells_p_1", () -> IForgeMenuType.create(SpellsP1Menu::new));
	public static final RegistryObject<MenuType<WizardsSeaRecipeMenu>> WIZARDS_SEA_RECIPE = REGISTRY.register("wizards_sea_recipe", () -> IForgeMenuType.create(WizardsSeaRecipeMenu::new));
}
