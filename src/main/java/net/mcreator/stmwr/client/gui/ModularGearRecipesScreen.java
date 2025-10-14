package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ModularGearRecipesMenu;
import net.mcreator.stmwr.network.ModularGearRecipesButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ModularGearRecipesScreen extends AbstractContainerScreen<ModularGearRecipesMenu> {
	private final static HashMap<String, Object> guistate = ModularGearRecipesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_helmet;
	Button button_chestplate;
	Button button_leggings;
	Button button_boots;
	Button button_helmet1;
	Button button_chestplate1;
	Button button_leggings1;
	Button button_boots1;

	public ModularGearRecipesScreen(ModularGearRecipesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/modular_gear_recipes.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.modular_gear_recipes.label_empty"), 3, 89, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.modular_gear_recipes.label_modular_armor"), 52, 83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.modular_gear_recipes.label_upgraded_modular_armor"), 28, 96, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(0, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 66, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_helmet = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_helmet"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(1, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 12, this.topPos + 7, 56, 20).build();
		guistate.put("button:button_helmet", button_helmet);
		this.addRenderableWidget(button_helmet);
		button_chestplate = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_chestplate"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(2, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 86, this.topPos + 7, 77, 20).build();
		guistate.put("button:button_chestplate", button_chestplate);
		this.addRenderableWidget(button_chestplate);
		button_leggings = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_leggings"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(3, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 12, this.topPos + 43, 67, 20).build();
		guistate.put("button:button_leggings", button_leggings);
		this.addRenderableWidget(button_leggings);
		button_boots = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_boots"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(4, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 112, this.topPos + 43, 51, 20).build();
		guistate.put("button:button_boots", button_boots);
		this.addRenderableWidget(button_boots);
		button_helmet1 = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_helmet1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(5, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 12, this.topPos + 111, 56, 20).build();
		guistate.put("button:button_helmet1", button_helmet1);
		this.addRenderableWidget(button_helmet1);
		button_chestplate1 = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_chestplate1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(6, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 86, this.topPos + 111, 77, 20).build();
		guistate.put("button:button_chestplate1", button_chestplate1);
		this.addRenderableWidget(button_chestplate1);
		button_leggings1 = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_leggings1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(7, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 12, this.topPos + 145, 67, 20).build();
		guistate.put("button:button_leggings1", button_leggings1);
		this.addRenderableWidget(button_leggings1);
		button_boots1 = Button.builder(Component.translatable("gui.stmwr.modular_gear_recipes.button_boots1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ModularGearRecipesButtonMessage(8, x, y, z));
				ModularGearRecipesButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 112, this.topPos + 144, 51, 20).build();
		guistate.put("button:button_boots1", button_boots1);
		this.addRenderableWidget(button_boots1);
	}
}
