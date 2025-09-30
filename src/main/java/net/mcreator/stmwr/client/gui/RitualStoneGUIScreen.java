package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.RitualStoneGUIMenu;
import net.mcreator.stmwr.network.RitualStoneGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RitualStoneGUIScreen extends AbstractContainerScreen<RitualStoneGUIMenu> {
	private final static HashMap<String, Object> guistate = RitualStoneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_commence;

	public RitualStoneGUIScreen(RitualStoneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 208;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/ritual_stone_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.ritual_stone_gui.label_ritual_stone"), 56, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.ritual_stone_gui.label_souls"), 147, 27, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_commence = Button.builder(Component.translatable("gui.stmwr.ritual_stone_gui.button_commence"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new RitualStoneGUIButtonMessage(0, x, y, z));
				RitualStoneGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 73, 67, 20).build();
		guistate.put("button:button_commence", button_commence);
		this.addRenderableWidget(button_commence);
	}
}
