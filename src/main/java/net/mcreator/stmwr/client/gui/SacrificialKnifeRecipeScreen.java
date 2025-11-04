package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.SacrificialKnifeRecipeMenu;
import net.mcreator.stmwr.network.SacrificialKnifeRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SacrificialKnifeRecipeScreen extends AbstractContainerScreen<SacrificialKnifeRecipeMenu> {
	private final static HashMap<String, Object> guistate = SacrificialKnifeRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public SacrificialKnifeRecipeScreen(SacrificialKnifeRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/sacrificial_knife_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-11-02_20-54-40.png"), this.leftPos + 3, this.topPos + 86, 0, 0, 166, 95, 166, 95);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_sacrificial_knife"), 44, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_made_with_a_brain_on_top_two_ey"), 4, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_eyes_then_two_lungs_and"), 5, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_stomachs_with_a_heart_at_the"), 6, 37, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_bottom_this_weapon_will_summon"), 4, 46, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_a_powerful_duo_of_bosses"), 5, 78, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_rainbow_labubu"), 4, 57, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.sacrificial_knife_recipe.label_this_weapon_will_summon"), 3, 68, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.sacrificial_knife_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new SacrificialKnifeRecipeButtonMessage(0, x, y, z));
				SacrificialKnifeRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 64, this.topPos + 176, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
