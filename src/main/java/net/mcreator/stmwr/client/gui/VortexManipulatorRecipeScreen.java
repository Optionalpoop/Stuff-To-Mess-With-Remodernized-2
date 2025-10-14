package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.VortexManipulatorRecipeMenu;
import net.mcreator.stmwr.network.VortexManipulatorRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class VortexManipulatorRecipeScreen extends AbstractContainerScreen<VortexManipulatorRecipeMenu> {
	private final static HashMap<String, Object> guistate = VortexManipulatorRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public VortexManipulatorRecipeScreen(VortexManipulatorRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/vortex_manipulator_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-10-12_15-48-04.png"), this.leftPos + 3, this.topPos + 23, 0, 0, 170, 106, 170, 106);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.vortex_manipulator_recipe.label_made_in_doomforge_blueprint"), 14, 164, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.vortex_manipulator_recipe.label_vortex_manipulator"), 41, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.vortex_manipulator_recipe.label_popped_chorus_fruit"), 33, 155, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.vortex_manipulator_recipe.label_dragon_breath"), 33, 144, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.vortex_manipulator_recipe.label_clock"), 33, 133, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.vortex_manipulator_recipe.label_ingredients"), 6, 125, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.vortex_manipulator_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new VortexManipulatorRecipeButtonMessage(0, x, y, z));
				VortexManipulatorRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 64, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
