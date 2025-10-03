package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BPModularArmorRecipeMenu;
import net.mcreator.stmwr.network.BPModularArmorRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BPModularArmorRecipeScreen extends AbstractContainerScreen<BPModularArmorRecipeMenu> {
	private final static HashMap<String, Object> guistate = BPModularArmorRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public BPModularArmorRecipeScreen(BPModularArmorRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/bp_modular_armor_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-03_15-42-27.png"), this.leftPos + 5, this.topPos + 86, 0, 0, 165, 77, 165, 77);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_the_modular_armor_blueprint"), 6, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_allows_you_to_craft_amazing_new"), 6, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_modular_armor_a_large_upgrade"), 6, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_over_deadiron_it_also_has_the"), 6, 39, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_advantage_of_being_upgraded"), 6, 50, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_when_you_get_the_upgrade"), 6, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.bp_modular_armor_recipe.label_blueprint"), 6, 71, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.bp_modular_armor_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BPModularArmorRecipeButtonMessage(0, x, y, z));
				BPModularArmorRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
