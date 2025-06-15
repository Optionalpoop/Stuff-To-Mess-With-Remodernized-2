
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.stmwr.client.gui.TortillaRecipeScreen;
import net.mcreator.stmwr.client.gui.ToolsAndArmorScreen;
import net.mcreator.stmwr.client.gui.TacoShellRecipeScreen;
import net.mcreator.stmwr.client.gui.TacoRecipeScreen;
import net.mcreator.stmwr.client.gui.StorageCubeGUIScreen;
import net.mcreator.stmwr.client.gui.SpellsP1Screen;
import net.mcreator.stmwr.client.gui.SpellforgeGUIScreen;
import net.mcreator.stmwr.client.gui.SausageRecipeScreen;
import net.mcreator.stmwr.client.gui.PotatoChipsRecipeScreen;
import net.mcreator.stmwr.client.gui.PizzaSliceRecipeScreen;
import net.mcreator.stmwr.client.gui.PizzaRecipeScreen;
import net.mcreator.stmwr.client.gui.PepperoniRecipeScreen;
import net.mcreator.stmwr.client.gui.MagiciansWorkbenchGUIScreen;
import net.mcreator.stmwr.client.gui.KitchenGUIScreen;
import net.mcreator.stmwr.client.gui.HomePageScreen;
import net.mcreator.stmwr.client.gui.GroundBeefRecipeScreen;
import net.mcreator.stmwr.client.gui.ForgeGUIScreen;
import net.mcreator.stmwr.client.gui.CookBookHomePageScreen;
import net.mcreator.stmwr.client.gui.CodexHomePageScreen;
import net.mcreator.stmwr.client.gui.ChocolateRecipeScreen;
import net.mcreator.stmwr.client.gui.ChickenNuggetRecipeScreen;
import net.mcreator.stmwr.client.gui.CheeseStickRecipeScreen;
import net.mcreator.stmwr.client.gui.CategoriesScreen;
import net.mcreator.stmwr.client.gui.BlocksPageScreen;
import net.mcreator.stmwr.client.gui.AlligatorKnifeRecipeScreen;

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
		});
	}
}
