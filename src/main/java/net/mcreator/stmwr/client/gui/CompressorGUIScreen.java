package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.CompressorGUIMenu;
import net.mcreator.stmwr.network.CompressorGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CompressorGUIScreen extends AbstractContainerScreen<CompressorGUIMenu> {
	private final static HashMap<String, Object> guistate = CompressorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_compress;
	Button button_uncompress;

	public CompressorGUIScreen(CompressorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 236;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/compressor_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.compressor_gui.label_compressor"), 109, 80, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.compressor_gui.label_empty"), 38, 101, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.compressor_gui.label_empty1"), 100, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.compressor_gui.label_empty2"), 130, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.compressor_gui.label_empty3"), 81, 101, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_compress = Button.builder(Component.translatable("gui.stmwr.compressor_gui.button_compress"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new CompressorGUIButtonMessage(0, x, y, z));
				CompressorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 99, this.topPos + 55, 67, 20).build();
		guistate.put("button:button_compress", button_compress);
		this.addRenderableWidget(button_compress);
		button_uncompress = Button.builder(Component.translatable("gui.stmwr.compressor_gui.button_uncompress"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new CompressorGUIButtonMessage(1, x, y, z));
				CompressorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 88, this.topPos + 97, 77, 20).build();
		guistate.put("button:button_uncompress", button_uncompress);
		this.addRenderableWidget(button_uncompress);
	}
}
