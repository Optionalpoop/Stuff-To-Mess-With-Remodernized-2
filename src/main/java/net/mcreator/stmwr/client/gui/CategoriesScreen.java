package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.CategoriesMenu;
import net.mcreator.stmwr.network.CategoriesButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CategoriesScreen extends AbstractContainerScreen<CategoriesMenu> {
	private final static HashMap<String, Object> guistate = CategoriesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_tools_and_armor;
	Button button_blocks;
	Button button_home_page;

	public CategoriesScreen(CategoriesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/categories.png");

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
		button_tools_and_armor = Button.builder(Component.translatable("gui.stmwr.categories.button_tools_and_armor"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new CategoriesButtonMessage(0, x, y, z));
				CategoriesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 5, 103, 20).build();
		guistate.put("button:button_tools_and_armor", button_tools_and_armor);
		this.addRenderableWidget(button_tools_and_armor);
		button_blocks = Button.builder(Component.translatable("gui.stmwr.categories.button_blocks"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new CategoriesButtonMessage(1, x, y, z));
				CategoriesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 112, this.topPos + 5, 56, 20).build();
		guistate.put("button:button_blocks", button_blocks);
		this.addRenderableWidget(button_blocks);
		button_home_page = Button.builder(Component.translatable("gui.stmwr.categories.button_home_page"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new CategoriesButtonMessage(2, x, y, z));
				CategoriesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 52, this.topPos + 175, 72, 20).build();
		guistate.put("button:button_home_page", button_home_page);
		this.addRenderableWidget(button_home_page);
	}
}
