package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.SnowyShrapnelRecipeMenu;
import net.mcreator.stmwr.network.SnowyShrapnelRecipeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SnowyShrapnelRecipeScreen extends AbstractContainerScreen<SnowyShrapnelRecipeMenu> {
	private final static HashMap<String, Object> guistate = SnowyShrapnelRecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public SnowyShrapnelRecipeScreen(SnowyShrapnelRecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/snowy_shrapnel_recipe.png");

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

		guiGraphics.blit(new ResourceLocation("stmwr:textures/screens/screenshot_from_2025-07-21_08-31-25.png"), this.leftPos + 3, this.topPos + 45, 0, 0, 169, 97, 169, 97);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.snowy_shrapnel_recipe.label_snowy_shrapnel_is_a_handy"), 5, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.snowy_shrapnel_recipe.label_freezing_spell_to_use_on_your"), 4, 13, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.snowy_shrapnel_recipe.label_enemies"), 5, 24, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.snowy_shrapnel_recipe.label_4_soul_shards"), 4, 134, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.snowy_shrapnel_recipe.label_4_stevum_ingots"), 4, 142, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.snowy_shrapnel_recipe.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new SnowyShrapnelRecipeButtonMessage(0, x, y, z));
				SnowyShrapnelRecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 66, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
