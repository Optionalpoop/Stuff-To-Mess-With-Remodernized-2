package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.PowercellRecipeMenu;
import net.mcreator.stmwr.network.PowercellRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PowercellRecipeScreen extends AbstractContainerScreen<PowercellRecipeMenu> {
	private final static HashMap<String, Object> guistate = PowercellRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public PowercellRecipeScreen(PowercellRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/powercell_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-12_11-31-34.png"), this.leftPos + 3, this.topPos + 13, 0, 0, 170, 105, 170, 105);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.powercell_recipe.label_made_in_doomforge_blueprint"), 11, 161, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.powercell_recipe.label_powercell"), 67, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.powercell_recipe.label_ingredients"), 6, 118, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.powercell_recipe.label_doomglass"), 49, 126, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.powercell_recipe.label_uranium_fuel_rod"), 49, 135, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.powercell_recipe.label_copper_plate"), 49, 144, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.powercell_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new PowercellRecipeButtonMessage(0, x, y, z));
				PowercellRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 66, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
