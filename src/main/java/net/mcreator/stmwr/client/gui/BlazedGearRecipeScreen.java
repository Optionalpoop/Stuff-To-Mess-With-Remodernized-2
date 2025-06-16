package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BlazedGearRecipeMenu;
import net.mcreator.stmwr.network.BlazedGearRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlazedGearRecipeScreen extends AbstractContainerScreen<BlazedGearRecipeMenu> {
	private final static HashMap<String, Object> guistate = BlazedGearRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_helmet;
	Button button_chestplate;
	Button button_leggings;
	Button button_boots;
	Button button_sword;
	Button button_axe;
	Button button_pickaxe;
	Button button_shovel;
	Button button_hoe;

	public BlazedGearRecipeScreen(BlazedGearRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/blazed_gear_recipe.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(0, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 176, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_helmet = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_helmet"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(1, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 4, 56, 20).build();
		guistate.put("button:button_helmet", button_helmet);
		this.addRenderableWidget(button_helmet);
		button_chestplate = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_chestplate"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(2, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 62, this.topPos + 4, 77, 20).build();
		guistate.put("button:button_chestplate", button_chestplate);
		this.addRenderableWidget(button_chestplate);
		button_leggings = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_leggings"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(3, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 27, 67, 20).build();
		guistate.put("button:button_leggings", button_leggings);
		this.addRenderableWidget(button_leggings);
		button_boots = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_boots"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(4, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 74, this.topPos + 27, 51, 20).build();
		guistate.put("button:button_boots", button_boots);
		this.addRenderableWidget(button_boots);
		button_sword = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_sword"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(5, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 49, 51, 20).build();
		guistate.put("button:button_sword", button_sword);
		this.addRenderableWidget(button_sword);
		button_axe = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_axe"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(6, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 49, 40, 20).build();
		guistate.put("button:button_axe", button_axe);
		this.addRenderableWidget(button_axe);
		button_pickaxe = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_pickaxe"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(7, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 98, this.topPos + 49, 61, 20).build();
		guistate.put("button:button_pickaxe", button_pickaxe);
		this.addRenderableWidget(button_pickaxe);
		button_shovel = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_shovel"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(8, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 72, 56, 20).build();
		guistate.put("button:button_shovel", button_shovel);
		this.addRenderableWidget(button_shovel);
		button_hoe = Button.builder(Component.translatable("gui.stmwr.blazed_gear_recipe.button_hoe"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlazedGearRecipeButtonMessage(9, x, y, z));
				BlazedGearRecipeButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 62, this.topPos + 72, 40, 20).build();
		guistate.put("button:button_hoe", button_hoe);
		this.addRenderableWidget(button_hoe);
	}
}
