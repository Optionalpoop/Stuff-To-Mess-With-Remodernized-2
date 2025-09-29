package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ManufacturingPlantGUIMenu;
import net.mcreator.stmwr.network.ManufacturingPlantGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ManufacturingPlantGUIScreen extends AbstractContainerScreen<ManufacturingPlantGUIMenu> {
	private final static HashMap<String, Object> guistate = ManufacturingPlantGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_nail;
	Button button_rod;
	Button button_plate;
	Button button_cog;
	Button button_spring;

	public ManufacturingPlantGUIScreen(ManufacturingPlantGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 263;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/manufacturing_plant_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_gui.label_manufacturing_plant"), 49, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manufacturing_plant_gui.label_fuel_rods"), 128, 50, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_nail = Button.builder(Component.translatable("gui.stmwr.manufacturing_plant_gui.button_nail"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManufacturingPlantGUIButtonMessage(0, x, y, z));
				ManufacturingPlantGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 213, this.topPos + 24, 46, 20).build();
		guistate.put("button:button_nail", button_nail);
		this.addRenderableWidget(button_nail);
		button_rod = Button.builder(Component.translatable("gui.stmwr.manufacturing_plant_gui.button_rod"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManufacturingPlantGUIButtonMessage(1, x, y, z));
				ManufacturingPlantGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 174, this.topPos + 24, 40, 20).build();
		guistate.put("button:button_rod", button_rod);
		this.addRenderableWidget(button_rod);
		button_plate = Button.builder(Component.translatable("gui.stmwr.manufacturing_plant_gui.button_plate"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManufacturingPlantGUIButtonMessage(2, x, y, z));
				ManufacturingPlantGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 4, 51, 20).build();
		guistate.put("button:button_plate", button_plate);
		this.addRenderableWidget(button_plate);
		button_cog = Button.builder(Component.translatable("gui.stmwr.manufacturing_plant_gui.button_cog"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManufacturingPlantGUIButtonMessage(3, x, y, z));
				ManufacturingPlantGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 219, this.topPos + 43, 40, 20).build();
		guistate.put("button:button_cog", button_cog);
		this.addRenderableWidget(button_cog);
		button_spring = Button.builder(Component.translatable("gui.stmwr.manufacturing_plant_gui.button_spring"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManufacturingPlantGUIButtonMessage(4, x, y, z));
				ManufacturingPlantGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 203, this.topPos + 4, 56, 20).build();
		guistate.put("button:button_spring", button_spring);
		this.addRenderableWidget(button_spring);
	}
}
