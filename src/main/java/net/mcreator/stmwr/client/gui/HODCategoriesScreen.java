package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.HODCategoriesMenu;
import net.mcreator.stmwr.network.HODCategoriesButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HODCategoriesScreen extends AbstractContainerScreen<HODCategoriesMenu> {
	private final static HashMap<String, Object> guistate = HODCategoriesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_overworld;
	Button button_stevecow_land;
	Button button_militaria;

	public HODCategoriesScreen(HODCategoriesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/hod_categories.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.hod_categories.label_1"), 83, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.hod_categories.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODCategoriesButtonMessage(0, x, y, z));
				HODCategoriesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.hod_categories.button_empty1"), e -> {
		}).bounds(this.leftPos + 122, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_overworld = Button.builder(Component.translatable("gui.stmwr.hod_categories.button_overworld"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODCategoriesButtonMessage(2, x, y, z));
				HODCategoriesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 6, 72, 20).build();
		guistate.put("button:button_overworld", button_overworld);
		this.addRenderableWidget(button_overworld);
		button_stevecow_land = Button.builder(Component.translatable("gui.stmwr.hod_categories.button_stevecow_land"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODCategoriesButtonMessage(3, x, y, z));
				HODCategoriesButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 6, 93, 20).build();
		guistate.put("button:button_stevecow_land", button_stevecow_land);
		this.addRenderableWidget(button_stevecow_land);
		button_militaria = Button.builder(Component.translatable("gui.stmwr.hod_categories.button_militaria"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODCategoriesButtonMessage(4, x, y, z));
				HODCategoriesButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 28, 72, 20).build();
		guistate.put("button:button_militaria", button_militaria);
		this.addRenderableWidget(button_militaria);
	}
}
