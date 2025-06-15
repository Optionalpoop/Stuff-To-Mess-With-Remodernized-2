package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.CookBookHomePageMenu;
import net.mcreator.stmwr.network.CookBookHomePageButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CookBookHomePageScreen extends AbstractContainerScreen<CookBookHomePageMenu> {
	private final static HashMap<String, Object> guistate = CookBookHomePageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next_page;

	public CookBookHomePageScreen(CookBookHomePageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/cook_book_home_page.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_welcome_to_your_grandmas_cook_b"), 6, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_book_this_will_have_all_the_re"), 6, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_recipes_you_need_for_the"), 6, 24, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_kitchen"), 6, 33, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_unfortunately_for_you_the"), 6, 51, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_author_of_this_book_did_a_truly"), 6, 60, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_horrible_job_of_organizing_it_s"), 6, 69, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_so_have_fun_scrolling_through"), 6, 78, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_all_of_the_many_pages_of_this"), 6, 87, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_amazing_cook_book"), 6, 96, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_fortunately_these_foods_are"), 6, 132, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_actually_worth_making_unlike"), 6, 141, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_most_modded_foods"), 6, 150, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_is_also_not_great_luckily"), 6, 105, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.cook_book_home_page.label_the_labels_should_help_a_bit"), 6, 114, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_next_page = Button.builder(Component.translatable("gui.stmwr.cook_book_home_page.button_next_page"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new CookBookHomePageButtonMessage(0, x, y, z));
				CookBookHomePageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 168, 72, 20).build();
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
