package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.HODMilitariaMenu;
import net.mcreator.stmwr.network.HODMilitariaButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HODMilitariaScreen extends AbstractContainerScreen<HODMilitariaMenu> {
	private final static HashMap<String, Object> guistate = HODMilitariaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_irradiated_pig;
	Button button_irradiated_cow;
	Button button_irradiated_chicken;
	Button button_ancient_wizard;
	Button button_the_timeless;
	Button button_gooling;

	public HODMilitariaScreen(HODMilitariaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/hod_militaria.png");

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
		button_back = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(0, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 64, this.topPos + 176, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_irradiated_pig = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_irradiated_pig"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(1, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 4, 98, 20).build();
		guistate.put("button:button_irradiated_pig", button_irradiated_pig);
		this.addRenderableWidget(button_irradiated_pig);
		button_irradiated_cow = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_irradiated_cow"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(2, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 25, 98, 20).build();
		guistate.put("button:button_irradiated_cow", button_irradiated_cow);
		this.addRenderableWidget(button_irradiated_cow);
		button_irradiated_chicken = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_irradiated_chicken"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(3, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 46, 119, 20).build();
		guistate.put("button:button_irradiated_chicken", button_irradiated_chicken);
		this.addRenderableWidget(button_irradiated_chicken);
		button_ancient_wizard = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_ancient_wizard"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(4, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 67, 98, 20).build();
		guistate.put("button:button_ancient_wizard", button_ancient_wizard);
		this.addRenderableWidget(button_ancient_wizard);
		button_the_timeless = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_the_timeless"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(5, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 88, 87, 20).build();
		guistate.put("button:button_the_timeless", button_the_timeless);
		this.addRenderableWidget(button_the_timeless);
		button_gooling = Button.builder(Component.translatable("gui.stmwr.hod_militaria.button_gooling"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODMilitariaButtonMessage(6, x, y, z));
				HODMilitariaButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 103, this.topPos + 4, 61, 20).build();
		guistate.put("button:button_gooling", button_gooling);
		this.addRenderableWidget(button_gooling);
	}
}
