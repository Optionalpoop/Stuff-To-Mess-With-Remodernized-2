package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.UraniumHydroponicsRecipeMenu;
import net.mcreator.stmwr.network.UraniumHydroponicsRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class UraniumHydroponicsRecipeScreen extends AbstractContainerScreen<UraniumHydroponicsRecipeMenu> {
	private final static HashMap<String, Object> guistate = UraniumHydroponicsRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public UraniumHydroponicsRecipeScreen(UraniumHydroponicsRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/uranium_hydroponics_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-12_11-03-04.png"), this.leftPos + 1, this.topPos + 17, 0, 0, 170, 105, 170, 105);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_made_in_doomforge_blueprint"), 14, 165, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_uranium_hydroponics"), 39, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_ingredients"), 5, 122, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_uranium_dust"), 70, 123, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_coldsteel_plate"), 70, 132, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_irradiated_water_bucket"), 49, 140, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_deadiron_casing"), 71, 148, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_hydroponics_recipe.label_dirt"), 71, 157, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.uranium_hydroponics_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new UraniumHydroponicsRecipeButtonMessage(0, x, y, z));
				UraniumHydroponicsRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
