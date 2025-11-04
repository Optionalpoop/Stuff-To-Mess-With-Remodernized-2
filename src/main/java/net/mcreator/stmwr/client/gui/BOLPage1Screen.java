package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BOLPage1Menu;
import net.mcreator.stmwr.network.BOLPage1ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BOLPage1Screen extends AbstractContainerScreen<BOLPage1Menu> {
	private final static HashMap<String, Object> guistate = BOLPage1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_activating_tier_ii_totems;
	Button button_creation_orbs;
	Button button_eye_of_the_stevecow;
	Button button_eye_of_time;
	Button button_sacrificial_knife;
	Button button_greater_creation_orb;

	public BOLPage1Screen(BOLPage1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/bol_page_1.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bol_page_1.label_1"), 86, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(0, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 174, 51, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_empty1"), e -> {
		}).bounds(this.leftPos + 116, this.topPos + 174, 51, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_activating_tier_ii_totems = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_activating_tier_ii_totems"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(2, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 5, 155, 20).build();
		guistate.put("button:button_activating_tier_ii_totems", button_activating_tier_ii_totems);
		this.addRenderableWidget(button_activating_tier_ii_totems);
		button_creation_orbs = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_creation_orbs"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(3, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 26, 93, 20).build();
		guistate.put("button:button_creation_orbs", button_creation_orbs);
		this.addRenderableWidget(button_creation_orbs);
		button_eye_of_the_stevecow = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_eye_of_the_stevecow"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(4, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 47, 124, 20).build();
		guistate.put("button:button_eye_of_the_stevecow", button_eye_of_the_stevecow);
		this.addRenderableWidget(button_eye_of_the_stevecow);
		button_eye_of_time = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_eye_of_time"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(5, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 68, 82, 20).build();
		guistate.put("button:button_eye_of_time", button_eye_of_time);
		this.addRenderableWidget(button_eye_of_time);
		button_sacrificial_knife = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_sacrificial_knife"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(6, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 89, 114, 20).build();
		guistate.put("button:button_sacrificial_knife", button_sacrificial_knife);
		this.addRenderableWidget(button_sacrificial_knife);
		button_greater_creation_orb = Button.builder(Component.translatable("gui.stmwr.bol_page_1.button_greater_creation_orb"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BOLPage1ButtonMessage(7, x, y, z));
				BOLPage1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 110, 129, 20).build();
		guistate.put("button:button_greater_creation_orb", button_greater_creation_orb);
		this.addRenderableWidget(button_greater_creation_orb);
	}
}
