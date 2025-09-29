package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ManupediaHomeMenu;
import net.mcreator.stmwr.network.ManupediaHomeButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ManupediaHomeScreen extends AbstractContainerScreen<ManupediaHomeMenu> {
	private final static HashMap<String, Object> guistate = ManupediaHomeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_exit;
	Button button_go_to_recipes;

	public ManupediaHomeScreen(ManupediaHomeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/manupedia_home.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_manupedia"), 4, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_welcome_to_the_manupedia"), 4, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_here_you_may_look_at_any"), 4, 37, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_all_recipes_that_can_be_done_by"), 4, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_the_manufacturing_plant"), 3, 57, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_usable_materials"), 3, 106, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_copper"), 80, 116, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_iron"), 80, 127, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_gold"), 80, 138, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_stevum"), 80, 148, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_coldsteel"), 80, 159, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_deadiron"), 80, 169, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.manupedia_home.label_storum"), 80, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_exit = Button.builder(Component.translatable("gui.stmwr.manupedia_home.button_exit"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaHomeButtonMessage(0, x, y, z));
				ManupediaHomeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_exit", button_exit);
		this.addRenderableWidget(button_exit);
		button_go_to_recipes = Button.builder(Component.translatable("gui.stmwr.manupedia_home.button_go_to_recipes"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ManupediaHomeButtonMessage(1, x, y, z));
				ManupediaHomeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 84, 92, 20).build();
		guistate.put("button:button_go_to_recipes", button_go_to_recipes);
		this.addRenderableWidget(button_go_to_recipes);
	}
}
