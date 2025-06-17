package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.AOTTotemsP1Menu;
import net.mcreator.stmwr.network.AOTTotemsP1ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AOTTotemsP1Screen extends AbstractContainerScreen<AOTTotemsP1Menu> {
	private final static HashMap<String, Object> guistate = AOTTotemsP1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_fire_resistance;
	Button button_water_breathing;
	Button button_speed;
	Button button_health_boost;
	Button button_jump_boost;
	Button button_night_vision;
	Button button_haste;
	Button button_strength;
	Button button_dolphins_grace;
	Button button_levitation;
	Button button_regeneration;
	Button button_gambling;

	public AOTTotemsP1Screen(AOTTotemsP1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/aot_totems_p_1.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_totems_p_1.label_1"), 84, 178, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_empty"), e -> {
		}).bounds(this.leftPos + 118, this.topPos + 173, 51, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_empty1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(1, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 173, 51, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_fire_resistance = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_fire_resistance"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(2, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 5, 103, 20).build();
		guistate.put("button:button_fire_resistance", button_fire_resistance);
		this.addRenderableWidget(button_fire_resistance);
		button_water_breathing = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_water_breathing"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(3, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 28, 103, 20).build();
		guistate.put("button:button_water_breathing", button_water_breathing);
		this.addRenderableWidget(button_water_breathing);
		button_speed = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_speed"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(4, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 110, this.topPos + 5, 51, 20).build();
		guistate.put("button:button_speed", button_speed);
		this.addRenderableWidget(button_speed);
		button_health_boost = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_health_boost"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(5, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 51, 87, 20).build();
		guistate.put("button:button_health_boost", button_health_boost);
		this.addRenderableWidget(button_health_boost);
		button_jump_boost = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_jump_boost"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(6, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 94, this.topPos + 51, 77, 20).build();
		guistate.put("button:button_jump_boost", button_jump_boost);
		this.addRenderableWidget(button_jump_boost);
		button_night_vision = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_night_vision"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(7, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 73, 87, 20).build();
		guistate.put("button:button_night_vision", button_night_vision);
		this.addRenderableWidget(button_night_vision);
		button_haste = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_haste"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(8, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 110, this.topPos + 28, 51, 20).build();
		guistate.put("button:button_haste", button_haste);
		this.addRenderableWidget(button_haste);
		button_strength = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_strength"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(9, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 94, this.topPos + 73, 67, 20).build();
		guistate.put("button:button_strength", button_strength);
		this.addRenderableWidget(button_strength);
		button_dolphins_grace = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_dolphins_grace"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(10, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 95, 103, 20).build();
		guistate.put("button:button_dolphins_grace", button_dolphins_grace);
		this.addRenderableWidget(button_dolphins_grace);
		button_levitation = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_levitation"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(11, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 117, 77, 20).build();
		guistate.put("button:button_levitation", button_levitation);
		this.addRenderableWidget(button_levitation);
		button_regeneration = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_regeneration"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(12, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 84, this.topPos + 117, 88, 20).build();
		guistate.put("button:button_regeneration", button_regeneration);
		this.addRenderableWidget(button_regeneration);
		button_gambling = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_1.button_gambling"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP1ButtonMessage(13, x, y, z));
				AOTTotemsP1ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 138, 67, 20).build();
		guistate.put("button:button_gambling", button_gambling);
		this.addRenderableWidget(button_gambling);
	}
}
