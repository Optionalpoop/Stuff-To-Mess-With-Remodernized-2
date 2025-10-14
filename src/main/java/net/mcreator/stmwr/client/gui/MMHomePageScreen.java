package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.MMHomePageMenu;
import net.mcreator.stmwr.network.MMHomePageButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MMHomePageScreen extends AbstractContainerScreen<MMHomePageMenu> {
	private final static HashMap<String, Object> guistate = MMHomePageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_close;
	Button button_multiblocks;

	public MMHomePageScreen(MMHomePageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/mm_home_page.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_welcome_to_multiblock_mastery"), 9, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_the_worst_yet_most_handy"), 7, 15, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_guide_in_stmwr_2x_this_is_whe"), 6, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_the_temporary_way_to_find_out"), 6, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_how_multiblocks_are_constructed"), 4, 50, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_do_not_worry_this_will_be"), 4, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_removed_when_the_guide"), 5, 70, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_home_page.label_implemented"), 3, 79, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_close = Button.builder(Component.translatable("gui.stmwr.mm_home_page.button_close"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMHomePageButtonMessage(0, x, y, z));
				MMHomePageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 13, this.topPos + 173, 51, 20).build();
		guistate.put("button:button_close", button_close);
		this.addRenderableWidget(button_close);
		button_multiblocks = Button.builder(Component.translatable("gui.stmwr.mm_home_page.button_multiblocks"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMHomePageButtonMessage(1, x, y, z));
				MMHomePageButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 81, this.topPos + 173, 82, 20).build();
		guistate.put("button:button_multiblocks", button_multiblocks);
		this.addRenderableWidget(button_multiblocks);
	}
}
