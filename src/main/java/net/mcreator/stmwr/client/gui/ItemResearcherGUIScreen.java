package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.ItemResearcherGUIMenu;
import net.mcreator.stmwr.network.ItemResearcherGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ItemResearcherGUIScreen extends AbstractContainerScreen<ItemResearcherGUIMenu> {
	private final static HashMap<String, Object> guistate = ItemResearcherGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_learn;

	public ItemResearcherGUIScreen(ItemResearcherGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/item_researcher_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.item_researcher_gui.label_item_researcher"), 6, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.item_researcher_gui.label_fuel_rods"), 30, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.item_researcher_gui.label_research_cells"), 31, 24, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_learn = Button.builder(Component.translatable("gui.stmwr.item_researcher_gui.button_learn"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new ItemResearcherGUIButtonMessage(0, x, y, z));
				ItemResearcherGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 59, this.topPos + 38, 51, 20).build();
		guistate.put("button:button_learn", button_learn);
		this.addRenderableWidget(button_learn);
	}
}
