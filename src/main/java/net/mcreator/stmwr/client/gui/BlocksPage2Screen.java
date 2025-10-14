package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.BlocksPage2Menu;
import net.mcreator.stmwr.network.BlocksPage2ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlocksPage2Screen extends AbstractContainerScreen<BlocksPage2Menu> {
	private final static HashMap<String, Object> guistate = BlocksPage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_uranium_hydroponics;
	Button button_hydroponics_utility_hatch;
	Button button_repair_plant;

	public BlocksPage2Screen(BlocksPage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/blocks_page_2.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.blocks_page_2.label_2"), 86, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.blocks_page_2.button_empty"), e -> {
		}).bounds(this.leftPos + 123, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.blocks_page_2.button_empty1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPage2ButtonMessage(1, x, y, z));
				BlocksPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_uranium_hydroponics = Button.builder(Component.translatable("gui.stmwr.blocks_page_2.button_uranium_hydroponics"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPage2ButtonMessage(2, x, y, z));
				BlocksPage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 4, 124, 20).build();
		guistate.put("button:button_uranium_hydroponics", button_uranium_hydroponics);
		this.addRenderableWidget(button_uranium_hydroponics);
		button_hydroponics_utility_hatch = Button.builder(Component.translatable("gui.stmwr.blocks_page_2.button_hydroponics_utility_hatch"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPage2ButtonMessage(3, x, y, z));
				BlocksPage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 25, 155, 20).build();
		guistate.put("button:button_hydroponics_utility_hatch", button_hydroponics_utility_hatch);
		this.addRenderableWidget(button_hydroponics_utility_hatch);
		button_repair_plant = Button.builder(Component.translatable("gui.stmwr.blocks_page_2.button_repair_plant"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new BlocksPage2ButtonMessage(4, x, y, z));
				BlocksPage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 46, 87, 20).build();
		guistate.put("button:button_repair_plant", button_repair_plant);
		this.addRenderableWidget(button_repair_plant);
	}
}
