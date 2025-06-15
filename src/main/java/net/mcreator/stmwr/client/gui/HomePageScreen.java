package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.HomePageMenu;
import net.mcreator.stmwr.network.HomePageButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HomePageScreen extends AbstractContainerScreen<HomePageMenu> {
	private final static HashMap<String, Object> guistate = HomePageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_categories;

	public HomePageScreen(HomePageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/home_page.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_welcome_to_the_forgers_guide"), 4, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_this_book_contains_all_of_the_re"), 3, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_recipes_for_the_forge_in_a_nice"), 3, 23, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_and_easy_to_read_fashion"), 4, 32, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_all_forge_recipes_require_a"), 4, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_forging_hammer_which_can_be"), 3, 58, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_made_up_of_many_different_things"), 3, 66, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.home_page.label_materials"), 3, 74, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_categories = Button.builder(Component.translatable("gui.stmwr.home_page.button_categories"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HomePageButtonMessage(0, x, y, z));
				HomePageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 93, this.topPos + 174, 77, 20).build();
		guistate.put("button:button_categories", button_categories);
		this.addRenderableWidget(button_categories);
	}
}
