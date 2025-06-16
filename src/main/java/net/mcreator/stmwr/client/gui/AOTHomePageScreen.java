package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.AOTHomePageMenu;
import net.mcreator.stmwr.network.AOTHomePageButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AOTHomePageScreen extends AbstractContainerScreen<AOTHomePageMenu> {
	private final static HashMap<String, Object> guistate = AOTHomePageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_totems;

	public AOTHomePageScreen(AOTHomePageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/aot_home_page.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_home_page.label_this_is_a_guide_to_all_of_the_re"), 4, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_home_page.label_totem_recipes_for_the_totem"), 4, 13, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_home_page.label_fusion_station"), 5, 22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_home_page.label_just_go_to_whatever_totem_you"), 4, 40, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_home_page.label_wish_to_learn_about_and_you"), 4, 50, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_home_page.label_view_the_recipes"), 4, 59, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_totems = Button.builder(Component.translatable("gui.stmwr.aot_home_page.button_totems"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTHomePageButtonMessage(0, x, y, z));
				AOTHomePageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 58, this.topPos + 174, 56, 20).build();
		guistate.put("button:button_totems", button_totems);
		this.addRenderableWidget(button_totems);
	}
}
