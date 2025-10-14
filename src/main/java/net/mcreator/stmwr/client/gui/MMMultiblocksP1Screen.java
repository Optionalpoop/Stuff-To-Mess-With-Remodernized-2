package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.MMMultiblocksP1Menu;
import net.mcreator.stmwr.network.MMMultiblocksP1ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MMMultiblocksP1Screen extends AbstractContainerScreen<MMMultiblocksP1Menu> {
	private final static HashMap<String, Object> guistate = MMMultiblocksP1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_doomforge;
	Button button_laboratory;
	Button button_manufacturing_plant;
	Button button_ritual_circle;
	Button button_concrete_mixer;
	Button button_tardis;
	Button button_uranium_processing_plant;
	Button button_radiation_removal_plant;
	Button button_uranium_hydroponics;
	Button button_soul_manipulator;

	public MMMultiblocksP1Screen(MMMultiblocksP1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/mm_multiblocks_p_1.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.mm_multiblocks_p_1.label_1"), 83, 178, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(0, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 173, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_empty1"), e -> {
		}).bounds(this.leftPos + 124, this.topPos + 173, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_doomforge = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_doomforge"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(2, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 5, 72, 20).build();
		guistate.put("button:button_doomforge", button_doomforge);
		this.addRenderableWidget(button_doomforge);
		button_laboratory = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_laboratory"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(3, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 78, this.topPos + 5, 77, 20).build();
		guistate.put("button:button_laboratory", button_laboratory);
		this.addRenderableWidget(button_laboratory);
		button_manufacturing_plant = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_manufacturing_plant"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(4, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 26, 124, 20).build();
		guistate.put("button:button_manufacturing_plant", button_manufacturing_plant);
		this.addRenderableWidget(button_manufacturing_plant);
		button_ritual_circle = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_ritual_circle"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(5, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 47, 93, 20).build();
		guistate.put("button:button_ritual_circle", button_ritual_circle);
		this.addRenderableWidget(button_ritual_circle);
		button_concrete_mixer = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_concrete_mixer"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(6, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 68, 98, 20).build();
		guistate.put("button:button_concrete_mixer", button_concrete_mixer);
		this.addRenderableWidget(button_concrete_mixer);
		button_tardis = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_tardis"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(7, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 104, this.topPos + 68, 56, 20).build();
		guistate.put("button:button_tardis", button_tardis);
		this.addRenderableWidget(button_tardis);
		button_uranium_processing_plant = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_uranium_processing_plant"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(8, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 89, 150, 20).build();
		guistate.put("button:button_uranium_processing_plant", button_uranium_processing_plant);
		this.addRenderableWidget(button_uranium_processing_plant);
		button_radiation_removal_plant = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_radiation_removal_plant"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(9, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 110, 145, 20).build();
		guistate.put("button:button_radiation_removal_plant", button_radiation_removal_plant);
		this.addRenderableWidget(button_radiation_removal_plant);
		button_uranium_hydroponics = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_uranium_hydroponics"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(10, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 131, 124, 20).build();
		guistate.put("button:button_uranium_hydroponics", button_uranium_hydroponics);
		this.addRenderableWidget(button_uranium_hydroponics);
		button_soul_manipulator = Button.builder(Component.translatable("gui.stmwr.mm_multiblocks_p_1.button_soul_manipulator"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new MMMultiblocksP1ButtonMessage(11, x, y, z));
				MMMultiblocksP1ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 152, 108, 20).build();
		guistate.put("button:button_soul_manipulator", button_soul_manipulator);
		this.addRenderableWidget(button_soul_manipulator);
	}
}
