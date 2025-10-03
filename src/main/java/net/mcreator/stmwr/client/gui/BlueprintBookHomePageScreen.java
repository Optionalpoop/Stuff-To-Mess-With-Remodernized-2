package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BlueprintBookHomePageMenu;
import net.mcreator.stmwr.network.BlueprintBookHomePageButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlueprintBookHomePageScreen extends AbstractContainerScreen<BlueprintBookHomePageMenu> {
	private final static HashMap<String, Object> guistate = BlueprintBookHomePageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_close;
	Button button_to_recipes;

	public BlueprintBookHomePageScreen(BlueprintBookHomePageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/blueprint_book_home_page.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blueprint_book_home_page.label_welcome_to_the_blueprint_book"), 7, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blueprint_book_home_page.label_view_all_of_the_recipes_for_blue"), 6, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blueprint_book_home_page.label_blueprints_these_are_all_for_us"), 6, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blueprint_book_home_page.label_use_within_the_doomforge"), 6, 36, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_close = Button.builder(Component.translatable("gui.stmwr.blueprint_book_home_page.button_close"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookHomePageButtonMessage(0, x, y, z));
				BlueprintBookHomePageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 24, this.topPos + 172, 51, 20).build();
		guistate.put("button:button_close", button_close);
		this.addRenderableWidget(button_close);
		button_to_recipes = Button.builder(Component.translatable("gui.stmwr.blueprint_book_home_page.button_to_recipes"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlueprintBookHomePageButtonMessage(1, x, y, z));
				BlueprintBookHomePageButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 75, this.topPos + 172, 82, 20).build();
		guistate.put("button:button_to_recipes", button_to_recipes);
		this.addRenderableWidget(button_to_recipes);
	}
}
