
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.stmwr.client.gui.WizardsSeaRecipeScreen;
import net.mcreator.stmwr.client.gui.TotemFusionStationGUIScreen;
import net.mcreator.stmwr.client.gui.TortillaRecipeScreen;
import net.mcreator.stmwr.client.gui.ToolsAndArmorScreen;
import net.mcreator.stmwr.client.gui.TacoShellRecipeScreen;
import net.mcreator.stmwr.client.gui.TacoRecipeScreen;
import net.mcreator.stmwr.client.gui.StorageCubeGUIScreen;
import net.mcreator.stmwr.client.gui.StopstoneRecipeScreen;
import net.mcreator.stmwr.client.gui.SpellsP1Screen;
import net.mcreator.stmwr.client.gui.SpellforgeGUIScreen;
import net.mcreator.stmwr.client.gui.SpeedstoneRecipeScreen;
import net.mcreator.stmwr.client.gui.SausageRecipeScreen;
import net.mcreator.stmwr.client.gui.PotatoChipsRecipeScreen;
import net.mcreator.stmwr.client.gui.PizzaSliceRecipeScreen;
import net.mcreator.stmwr.client.gui.PizzaRecipeScreen;
import net.mcreator.stmwr.client.gui.PepperoniRecipeScreen;
import net.mcreator.stmwr.client.gui.OrePurifierGUIScreen;
import net.mcreator.stmwr.client.gui.MagiciansWorkbenchGUIScreen;
import net.mcreator.stmwr.client.gui.KitchenGUIScreen;
import net.mcreator.stmwr.client.gui.HomePageScreen;
import net.mcreator.stmwr.client.gui.GroundBeefRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumSwordRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumShovelRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumPickaxeRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumLeggingsRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumHoeRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumHelmetRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumGearRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumChestplateRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumBootsRecipeScreen;
import net.mcreator.stmwr.client.gui.GodliumAxeRecipeScreen;
import net.mcreator.stmwr.client.gui.ForgeGUIScreen;
import net.mcreator.stmwr.client.gui.FlamingStorageCubeRecipeScreen;
import net.mcreator.stmwr.client.gui.FlamingStorageCubeGUIScreen;
import net.mcreator.stmwr.client.gui.DupestoneRecipeScreen;
import net.mcreator.stmwr.client.gui.CookBookHomePageScreen;
import net.mcreator.stmwr.client.gui.CodexHomePageScreen;
import net.mcreator.stmwr.client.gui.ChocolateRecipeScreen;
import net.mcreator.stmwr.client.gui.ChickenNuggetRecipeScreen;
import net.mcreator.stmwr.client.gui.CheeseStickRecipeScreen;
import net.mcreator.stmwr.client.gui.CategoriesScreen;
import net.mcreator.stmwr.client.gui.BlocksPageScreen;
import net.mcreator.stmwr.client.gui.BlazingPlasticRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedSwordRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedShovelRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedPickaxeRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedLeggingsRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedHoeRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedHelmetRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedGearRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedChestplateRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedBootsRecipeScreen;
import net.mcreator.stmwr.client.gui.BlazedAxeRecipeScreen;
import net.mcreator.stmwr.client.gui.AlloyFuseGUIScreen;
import net.mcreator.stmwr.client.gui.AlligatorKnifeRecipeScreen;
import net.mcreator.stmwr.client.gui.AOTTotemsP1Screen;
import net.mcreator.stmwr.client.gui.AOTHomePageScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StmwrModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StmwrModMenus.KITCHEN_GUI.get(), KitchenGUIScreen::new);
			MenuScreens.register(StmwrModMenus.COOK_BOOK_HOME_PAGE.get(), CookBookHomePageScreen::new);
			MenuScreens.register(StmwrModMenus.CHICKEN_NUGGET_RECIPE.get(), ChickenNuggetRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.POTATO_CHIPS_RECIPE.get(), PotatoChipsRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.TACO_RECIPE.get(), TacoRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.TACO_SHELL_RECIPE.get(), TacoShellRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.CHOCOLATE_RECIPE.get(), ChocolateRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.SAUSAGE_RECIPE.get(), SausageRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GROUND_BEEF_RECIPE.get(), GroundBeefRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.PIZZA_SLICE_RECIPE.get(), PizzaSliceRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.TORTILLA_RECIPE.get(), TortillaRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.PIZZA_RECIPE.get(), PizzaRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.PEPPERONI_RECIPE.get(), PepperoniRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.CHEESE_STICK_RECIPE.get(), CheeseStickRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.MAGICIANS_WORKBENCH_GUI.get(), MagiciansWorkbenchGUIScreen::new);
			MenuScreens.register(StmwrModMenus.STORAGE_CUBE_GUI.get(), StorageCubeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.FORGE_GUI.get(), ForgeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.HOME_PAGE.get(), HomePageScreen::new);
			MenuScreens.register(StmwrModMenus.CATEGORIES.get(), CategoriesScreen::new);
			MenuScreens.register(StmwrModMenus.TOOLS_AND_ARMOR.get(), ToolsAndArmorScreen::new);
			MenuScreens.register(StmwrModMenus.BLOCKS_PAGE.get(), BlocksPageScreen::new);
			MenuScreens.register(StmwrModMenus.ALLIGATOR_KNIFE_RECIPE.get(), AlligatorKnifeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.SPELLFORGE_GUI.get(), SpellforgeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.CODEX_HOME_PAGE.get(), CodexHomePageScreen::new);
			MenuScreens.register(StmwrModMenus.SPELLS_P_1.get(), SpellsP1Screen::new);
			MenuScreens.register(StmwrModMenus.WIZARDS_SEA_RECIPE.get(), WizardsSeaRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_GEAR_RECIPE.get(), BlazedGearRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_HELMET_RECIPE.get(), BlazedHelmetRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_CHESTPLATE_RECIPE.get(), BlazedChestplateRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_LEGGINGS_RECIPE.get(), BlazedLeggingsRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_BOOTS_RECIPE.get(), BlazedBootsRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_SWORD_RECIPE.get(), BlazedSwordRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_AXE_RECIPE.get(), BlazedAxeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_PICKAXE_RECIPE.get(), BlazedPickaxeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_SHOVEL_RECIPE.get(), BlazedShovelRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZED_HOE_RECIPE.get(), BlazedHoeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.BLAZING_PLASTIC_RECIPE.get(), BlazingPlasticRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.FLAMING_STORAGE_CUBE_GUI.get(), FlamingStorageCubeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.FLAMING_STORAGE_CUBE_RECIPE.get(), FlamingStorageCubeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.ORE_PURIFIER_GUI.get(), OrePurifierGUIScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_GEAR_RECIPE.get(), GodliumGearRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_HELMET_RECIPE.get(), GodliumHelmetRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_CHESTPLATE_RECIPE.get(), GodliumChestplateRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_LEGGINGS_RECIPE.get(), GodliumLeggingsRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_BOOTS_RECIPE.get(), GodliumBootsRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_SWORD_RECIPE.get(), GodliumSwordRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_PICKAXE_RECIPE.get(), GodliumPickaxeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_AXE_RECIPE.get(), GodliumAxeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_SHOVEL_RECIPE.get(), GodliumShovelRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.GODLIUM_HOE_RECIPE.get(), GodliumHoeRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.STOPSTONE_RECIPE.get(), StopstoneRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.SPEEDSTONE_RECIPE.get(), SpeedstoneRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.DUPESTONE_RECIPE.get(), DupestoneRecipeScreen::new);
			MenuScreens.register(StmwrModMenus.ALLOY_FUSE_GUI.get(), AlloyFuseGUIScreen::new);
			MenuScreens.register(StmwrModMenus.TOTEM_FUSION_STATION_GUI.get(), TotemFusionStationGUIScreen::new);
			MenuScreens.register(StmwrModMenus.AOT_HOME_PAGE.get(), AOTHomePageScreen::new);
			MenuScreens.register(StmwrModMenus.AOT_TOTEMS_P_1.get(), AOTTotemsP1Screen::new);
		});
	}
}
