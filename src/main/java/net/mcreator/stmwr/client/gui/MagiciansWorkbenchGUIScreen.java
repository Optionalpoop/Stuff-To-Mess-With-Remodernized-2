package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.MagiciansWorkbenchGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MagiciansWorkbenchGUIScreen extends AbstractContainerScreen<MagiciansWorkbenchGUIMenu> {
	private final static HashMap<String, Object> guistate = MagiciansWorkbenchGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_enchant;

	public MagiciansWorkbenchGUIScreen(MagiciansWorkbenchGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/magicians_workbench_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.magicians_workbench_gui.label_empty"), 38, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.magicians_workbench_gui.label_empty1"), 75, 35, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.magicians_workbench_gui.label_magicians_workbench"), 6, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.magicians_workbench_gui.label_book"), 52, 53, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.magicians_workbench_gui.label_wand"), 8, 53, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_enchant = Button.builder(Component.translatable("gui.stmwr.magicians_workbench_gui.button_enchant"), e -> {
		}).bounds(this.leftPos + 104, this.topPos + 54, 61, 20).build();
		guistate.put("button:button_enchant", button_enchant);
		this.addRenderableWidget(button_enchant);
	}
}
