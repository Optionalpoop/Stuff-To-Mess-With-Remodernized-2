package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.RepairPlantGUIMenu;
import net.mcreator.stmwr.network.RepairPlantGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RepairPlantGUIScreen extends AbstractContainerScreen<RepairPlantGUIMenu> {
	private final static HashMap<String, Object> guistate = RepairPlantGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_repair;

	public RepairPlantGUIScreen(RepairPlantGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/repair_plant_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.repair_plant_gui.label_repair_plant"), 5, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.repair_plant_gui.label_fuel_rods"), 42, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.repair_plant_gui.label_target"), 43, 41, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_repair = Button.builder(Component.translatable("gui.stmwr.repair_plant_gui.button_repair"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new RepairPlantGUIButtonMessage(0, x, y, z));
				RepairPlantGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 99, this.topPos + 36, 56, 20).build();
		guistate.put("button:button_repair", button_repair);
		this.addRenderableWidget(button_repair);
	}
}
