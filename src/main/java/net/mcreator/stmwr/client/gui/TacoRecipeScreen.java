package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.TacoRecipeMenu;
import net.mcreator.stmwr.network.TacoRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TacoRecipeScreen extends AbstractContainerScreen<TacoRecipeMenu> {
	private final static HashMap<String, Object> guistate = TacoRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next_page;

	public TacoRecipeScreen(TacoRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/taco_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-06-12_11-42-47.png"), this.leftPos + 0, this.topPos + 65, 0, 0, 172, 103, 172, 103);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.taco_recipe.label_taco"), 77, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.taco_recipe.label_ingredients"), 5, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.taco_recipe.label_cheese"), 42, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.taco_recipe.label_tomatoes"), 42, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.taco_recipe.label_taco_shells"), 42, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.taco_recipe.label_ground_beef"), 42, 52, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_next_page = Button.builder(Component.translatable("gui.stmwr.taco_recipe.button_next_page"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new TacoRecipeButtonMessage(0, x, y, z));
				TacoRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 100, this.topPos + 176, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
