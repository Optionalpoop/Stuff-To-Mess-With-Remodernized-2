package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ChocolateRecipeMenu;
import net.mcreator.stmwr.network.ChocolateRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChocolateRecipeScreen extends AbstractContainerScreen<ChocolateRecipeMenu> {
	private final static HashMap<String, Object> guistate = ChocolateRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next_page;

	public ChocolateRecipeScreen(ChocolateRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/chocolate_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-06-12_11-41-37.png"), this.leftPos + 0, this.topPos + 51, 0, 0, 172, 103, 172, 103);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.chocolate_recipe.label_chocolate"), 63, 2, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.chocolate_recipe.label_ingredients"), 4, 12, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.chocolate_recipe.label_cocoa_beans"), 39, 23, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.chocolate_recipe.label_sugar"), 39, 32, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_next_page = Button.builder(Component.translatable("gui.stmwr.chocolate_recipe.button_next_page"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ChocolateRecipeButtonMessage(0, x, y, z));
				ChocolateRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 99, this.topPos + 174, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
