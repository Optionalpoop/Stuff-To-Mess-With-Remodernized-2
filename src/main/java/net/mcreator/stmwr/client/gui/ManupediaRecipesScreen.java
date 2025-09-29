package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ManupediaRecipesMenu;
import net.mcreator.stmwr.network.ManupediaRecipesButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ManupediaRecipesScreen extends AbstractContainerScreen<ManupediaRecipesMenu> {
	private final static HashMap<String, Object> guistate = ManupediaRecipesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_nails;
	Button button_rods;
	Button button_plates;
	Button button_cogs;
	Button button_springs;

	public ManupediaRecipesScreen(ManupediaRecipesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/manupedia_recipes.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_recipes.label_1"), 85, 178, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaRecipesButtonMessage(0, x, y, z));
				ManupediaRecipesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_empty1"), e -> {
		}).bounds(this.leftPos + 123, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_nails = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_nails"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaRecipesButtonMessage(2, x, y, z));
				ManupediaRecipesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 6, 51, 20).build();
		guistate.put("button:button_nails", button_nails);
		this.addRenderableWidget(button_nails);
		button_rods = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_rods"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaRecipesButtonMessage(3, x, y, z));
				ManupediaRecipesButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 6, 46, 20).build();
		guistate.put("button:button_rods", button_rods);
		this.addRenderableWidget(button_rods);
		button_plates = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_plates"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaRecipesButtonMessage(4, x, y, z));
				ManupediaRecipesButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 108, this.topPos + 6, 56, 20).build();
		guistate.put("button:button_plates", button_plates);
		this.addRenderableWidget(button_plates);
		button_cogs = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_cogs"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaRecipesButtonMessage(5, x, y, z));
				ManupediaRecipesButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 28, 46, 20).build();
		guistate.put("button:button_cogs", button_cogs);
		this.addRenderableWidget(button_cogs);
		button_springs = Button.builder(Component.translatable("gui.stmwr.manupedia_recipes.button_springs"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaRecipesButtonMessage(6, x, y, z));
				ManupediaRecipesButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 55, this.topPos + 28, 61, 20).build();
		guistate.put("button:button_springs", button_springs);
		this.addRenderableWidget(button_springs);
	}
}
