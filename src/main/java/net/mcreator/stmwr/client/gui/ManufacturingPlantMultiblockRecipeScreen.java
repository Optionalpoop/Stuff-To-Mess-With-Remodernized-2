package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ManufacturingPlantMultiblockRecipeMenu;
import net.mcreator.stmwr.network.ManufacturingPlantMultiblockRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ManufacturingPlantMultiblockRecipeScreen extends AbstractContainerScreen<ManufacturingPlantMultiblockRecipeMenu> {
	private final static HashMap<String, Object> guistate = ManufacturingPlantMultiblockRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public ManufacturingPlantMultiblockRecipeScreen(ManufacturingPlantMultiblockRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/manufacturing_plant_multiblock_recipe.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-14_13-38-24.png"), this.leftPos + -276, this.topPos + -38, 0, 0, 575, 114, 575, 114);

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-14_13-38-24.png"), this.leftPos + 153, this.topPos + 60, 0, 0, 575, 114, 575, 114);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_ingredients"), 12, 76, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_deadiron_casing"), 34, 86, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_uranium_block"), 34, 96, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_redstone_block"), 34, 105, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_iron_bar"), 33, 115, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_doomglass"), 33, 124, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.label_manufacturing_plant_access_point"), -12, 132, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.manufacturing_plant_multiblock_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManufacturingPlantMultiblockRecipeButtonMessage(0, x, y, z));
				ManufacturingPlantMultiblockRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
