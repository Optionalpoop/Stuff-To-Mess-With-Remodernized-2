package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ToolsAndArmorMenu;
import net.mcreator.stmwr.network.ToolsAndArmorButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ToolsAndArmorScreen extends AbstractContainerScreen<ToolsAndArmorMenu> {
	private final static HashMap<String, Object> guistate = ToolsAndArmorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_alligator_knife;
	Button button_blazed_gear;
	Button button_godlium_gear;

	public ToolsAndArmorScreen(ToolsAndArmorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/tools_and_armor.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.tools_and_armor.label_1"), 83, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.tools_and_armor.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ToolsAndArmorButtonMessage(0, x, y, z));
				ToolsAndArmorButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.tools_and_armor.button_empty1"), e -> {
		}).bounds(this.leftPos + 124, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_alligator_knife = Button.builder(Component.translatable("gui.stmwr.tools_and_armor.button_alligator_knife"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ToolsAndArmorButtonMessage(2, x, y, z));
				ToolsAndArmorButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 5, 103, 20).build();
		guistate.put("button:button_alligator_knife", button_alligator_knife);
		this.addRenderableWidget(button_alligator_knife);
		button_blazed_gear = Button.builder(Component.translatable("gui.stmwr.tools_and_armor.button_blazed_gear"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ToolsAndArmorButtonMessage(3, x, y, z));
				ToolsAndArmorButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 26, 82, 20).build();
		guistate.put("button:button_blazed_gear", button_blazed_gear);
		this.addRenderableWidget(button_blazed_gear);
		button_godlium_gear = Button.builder(Component.translatable("gui.stmwr.tools_and_armor.button_godlium_gear"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ToolsAndArmorButtonMessage(4, x, y, z));
				ToolsAndArmorButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 47, 87, 20).build();
		guistate.put("button:button_godlium_gear", button_godlium_gear);
		this.addRenderableWidget(button_godlium_gear);
	}
}
