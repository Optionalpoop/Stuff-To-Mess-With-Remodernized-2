package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.UraniumProcessingPlantGUIMenu;
import net.mcreator.stmwr.network.UraniumProcessingPlantGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class UraniumProcessingPlantGUIScreen extends AbstractContainerScreen<UraniumProcessingPlantGUIMenu> {
	private final static HashMap<String, Object> guistate = UraniumProcessingPlantGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_create_rods;

	public UraniumProcessingPlantGUIScreen(UraniumProcessingPlantGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/uranium_processing_plant_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_processing_plant_gui.label_uranium_processing_plant"), 4, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_processing_plant_gui.label_4_uranium"), 47, 20, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_processing_plant_gui.label_1_deadiron"), 71, 31, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.uranium_processing_plant_gui.label_empty"), 68, 41, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_create_rods = Button.builder(Component.translatable("gui.stmwr.uranium_processing_plant_gui.button_create_rods"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new UraniumProcessingPlantGUIButtonMessage(0, x, y, z));
				UraniumProcessingPlantGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 59, 82, 20).build();
		guistate.put("button:button_create_rods", button_create_rods);
		this.addRenderableWidget(button_create_rods);
	}
}
