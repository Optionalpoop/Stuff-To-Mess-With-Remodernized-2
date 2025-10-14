package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BlueprintBookP1Menu;
import net.mcreator.stmwr.network.BlueprintBookP1ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlueprintBookP1Screen extends AbstractContainerScreen<BlueprintBookP1Menu> {
	private final static HashMap<String, Object> guistate = BlueprintBookP1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_concrete_mixer;
	Button button_uranium_hydroponics;
	Button button_powercell;
	Button button_modular_armor;
	Button button_modular_armor_upgrades;
	Button button_repair_plant;
	Button button_vortex_manipulator;
	Button button_portable_crucibleoven;

	public BlueprintBookP1Screen(BlueprintBookP1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/blueprint_book_p_1.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blueprint_book_p_1.label_1"), 85, 178, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(0, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 173, 51, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_empty1"), e -> {
		}).bounds(this.leftPos + 118, this.topPos + 173, 51, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_concrete_mixer = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_concrete_mixer"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(2, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 5, 98, 20).build();
		guistate.put("button:button_concrete_mixer", button_concrete_mixer);
		this.addRenderableWidget(button_concrete_mixer);
		button_uranium_hydroponics = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_uranium_hydroponics"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(3, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 26, 124, 20).build();
		guistate.put("button:button_uranium_hydroponics", button_uranium_hydroponics);
		this.addRenderableWidget(button_uranium_hydroponics);
		button_powercell = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_powercell"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(4, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 47, 72, 20).build();
		guistate.put("button:button_powercell", button_powercell);
		this.addRenderableWidget(button_powercell);
		button_modular_armor = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_modular_armor"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(5, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 47, 93, 20).build();
		guistate.put("button:button_modular_armor", button_modular_armor);
		this.addRenderableWidget(button_modular_armor);
		button_modular_armor_upgrades = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_modular_armor_upgrades"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(6, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 68, 140, 20).build();
		guistate.put("button:button_modular_armor_upgrades", button_modular_armor_upgrades);
		this.addRenderableWidget(button_modular_armor_upgrades);
		button_repair_plant = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_repair_plant"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(7, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 89, 87, 20).build();
		guistate.put("button:button_repair_plant", button_repair_plant);
		this.addRenderableWidget(button_repair_plant);
		button_vortex_manipulator = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_vortex_manipulator"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(8, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 110, 119, 20).build();
		guistate.put("button:button_vortex_manipulator", button_vortex_manipulator);
		this.addRenderableWidget(button_vortex_manipulator);
		button_portable_crucibleoven = Button.builder(Component.translatable("gui.stmwr.blueprint_book_p_1.button_portable_crucibleoven"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookP1ButtonMessage(9, x, y, z));
				BlueprintBookP1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 131, 140, 20).build();
		guistate.put("button:button_portable_crucibleoven", button_portable_crucibleoven);
		this.addRenderableWidget(button_portable_crucibleoven);
	}
}
