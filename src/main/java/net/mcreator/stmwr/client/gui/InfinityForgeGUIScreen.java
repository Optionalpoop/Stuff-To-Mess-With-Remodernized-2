package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.InfinityForgeGUIMenu;
import net.mcreator.stmwr.network.InfinityForgeGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class InfinityForgeGUIScreen extends AbstractContainerScreen<InfinityForgeGUIMenu> {
	private final static HashMap<String, Object> guistate = InfinityForgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_final_fusion;

	public InfinityForgeGUIScreen(InfinityForgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/infinity_forge_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.infinity_forge_gui.label_infinity_forge"), 96, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.infinity_forge_gui.label_8x_infinitite_scrap"), 13, 58, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.infinity_forge_gui.label_empty"), 13, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.infinity_forge_gui.label_1x_stevum_ingot"), 39, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.infinity_forge_gui.label_v"), 40, 23, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_final_fusion = Button.builder(Component.translatable("gui.stmwr.infinity_forge_gui.button_final_fusion"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new InfinityForgeGUIButtonMessage(0, x, y, z));
				InfinityForgeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 33, 87, 20).build();
		guistate.put("button:button_final_fusion", button_final_fusion);
		this.addRenderableWidget(button_final_fusion);
	}
}
