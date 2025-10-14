package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ReinforcedArmsRecipeMenu;
import net.mcreator.stmwr.network.ReinforcedArmsRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ReinforcedArmsRecipeScreen extends AbstractContainerScreen<ReinforcedArmsRecipeMenu> {
	private final static HashMap<String, Object> guistate = ReinforcedArmsRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public ReinforcedArmsRecipeScreen(ReinforcedArmsRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/reinforced_arms_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-12_12-09-57.png"), this.leftPos + 3, this.topPos + 18, 0, 0, 170, 105, 170, 105);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.reinforced_arms_recipe.label_modular_helmet"), 48, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.reinforced_arms_recipe.label_made_in_the_doomforge_with"), 6, 126, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.reinforced_arms_recipe.label_coldsteel_plates_and_a_deadiron"), 5, 134, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.reinforced_arms_recipe.label_dont_forget_the_required_bluepr"), 8, 155, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.reinforced_arms_recipe.label_also_the_old_modular_armor"), 15, 164, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.reinforced_arms_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ReinforcedArmsRecipeButtonMessage(0, x, y, z));
				ReinforcedArmsRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 62, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
