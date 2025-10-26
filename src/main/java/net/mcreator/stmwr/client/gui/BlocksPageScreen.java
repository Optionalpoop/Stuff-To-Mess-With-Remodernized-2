package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BlocksPageMenu;
import net.mcreator.stmwr.network.BlocksPageButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlocksPageScreen extends AbstractContainerScreen<BlocksPageMenu> {
	private final static HashMap<String, Object> guistate = BlocksPageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_blazing_plastic;
	Button button_stopstone;
	Button button_speedstone;
	Button button_dupestone;
	Button button_trial_brick;
	Button button_ritual_stone;
	Button button_concrete_mixer;
	Button button_warp_brick;
	Button button_improved_cell;
	Button button_hypercell;

	public BlocksPageScreen(BlocksPageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/blocks_page.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blocks_page.label_1"), 85, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(0, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_empty1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(1, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 124, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_blazing_plastic = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_blazing_plastic"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(2, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 5, 103, 20).build();
		guistate.put("button:button_blazing_plastic", button_blazing_plastic);
		this.addRenderableWidget(button_blazing_plastic);
		button_stopstone = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_stopstone"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(3, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 26, 72, 20).build();
		guistate.put("button:button_stopstone", button_stopstone);
		this.addRenderableWidget(button_stopstone);
		button_speedstone = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_speedstone"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(4, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 26, 77, 20).build();
		guistate.put("button:button_speedstone", button_speedstone);
		this.addRenderableWidget(button_speedstone);
		button_dupestone = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_dupestone"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(5, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 47, 72, 20).build();
		guistate.put("button:button_dupestone", button_dupestone);
		this.addRenderableWidget(button_dupestone);
		button_trial_brick = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_trial_brick"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(6, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 47, 82, 20).build();
		guistate.put("button:button_trial_brick", button_trial_brick);
		this.addRenderableWidget(button_trial_brick);
		button_ritual_stone = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_ritual_stone"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(7, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 68, 87, 20).build();
		guistate.put("button:button_ritual_stone", button_ritual_stone);
		this.addRenderableWidget(button_ritual_stone);
		button_concrete_mixer = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_concrete_mixer"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(8, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 89, 98, 20).build();
		guistate.put("button:button_concrete_mixer", button_concrete_mixer);
		this.addRenderableWidget(button_concrete_mixer);
		button_warp_brick = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_warp_brick"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(9, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 93, this.topPos + 68, 77, 20).build();
		guistate.put("button:button_warp_brick", button_warp_brick);
		this.addRenderableWidget(button_warp_brick);
		button_improved_cell = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_improved_cell"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(10, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 110, 93, 20).build();
		guistate.put("button:button_improved_cell", button_improved_cell);
		this.addRenderableWidget(button_improved_cell);
		button_hypercell = Button.builder(Component.translatable("gui.stmwr.blocks_page.button_hypercell"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPageButtonMessage(11, x, y, z));
				BlocksPageButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 99, this.topPos + 110, 72, 20).build();
		guistate.put("button:button_hypercell", button_hypercell);
		this.addRenderableWidget(button_hypercell);
	}
}
