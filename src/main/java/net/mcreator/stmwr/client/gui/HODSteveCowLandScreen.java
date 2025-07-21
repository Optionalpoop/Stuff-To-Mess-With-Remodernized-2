package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.HODSteveCowLandMenu;
import net.mcreator.stmwr.network.HODSteveCowLandButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HODSteveCowLandScreen extends AbstractContainerScreen<HODSteveCowLandMenu> {
	private final static HashMap<String, Object> guistate = HODSteveCowLandMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_stevecow;
	Button button_frombie;
	Button button_pikachu;
	Button button_crusher;
	Button button_lesser_wizard;
	Button button_lightning_cultist;
	Button button_lightning_wizard;
	Button button_giant_stevecow;

	public HODSteveCowLandScreen(HODSteveCowLandMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/hod_steve_cow_land.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.hod_steve_cow_land.label_1"), 87, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(0, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_empty1"), e -> {
		}).bounds(this.leftPos + 124, this.topPos + 175, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_stevecow = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_stevecow"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(2, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 5, 67, 20).build();
		guistate.put("button:button_stevecow", button_stevecow);
		this.addRenderableWidget(button_stevecow);
		button_frombie = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_frombie"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(3, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 74, this.topPos + 5, 61, 20).build();
		guistate.put("button:button_frombie", button_frombie);
		this.addRenderableWidget(button_frombie);
		button_pikachu = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_pikachu"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(4, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 26, 61, 20).build();
		guistate.put("button:button_pikachu", button_pikachu);
		this.addRenderableWidget(button_pikachu);
		button_crusher = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_crusher"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(5, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 47, 61, 20).build();
		guistate.put("button:button_crusher", button_crusher);
		this.addRenderableWidget(button_crusher);
		button_lesser_wizard = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_lesser_wizard"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(6, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 26, 93, 20).build();
		guistate.put("button:button_lesser_wizard", button_lesser_wizard);
		this.addRenderableWidget(button_lesser_wizard);
		button_lightning_cultist = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_lightning_cultist"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(7, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 68, 114, 20).build();
		guistate.put("button:button_lightning_cultist", button_lightning_cultist);
		this.addRenderableWidget(button_lightning_cultist);
		button_lightning_wizard = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_lightning_wizard"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(8, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 89, 108, 20).build();
		guistate.put("button:button_lightning_wizard", button_lightning_wizard);
		this.addRenderableWidget(button_lightning_wizard);
		button_giant_stevecow = Button.builder(Component.translatable("gui.stmwr.hod_steve_cow_land.button_giant_stevecow"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new HODSteveCowLandButtonMessage(9, x, y, z));
				HODSteveCowLandButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 47, 98, 20).build();
		guistate.put("button:button_giant_stevecow", button_giant_stevecow);
		this.addRenderableWidget(button_giant_stevecow);
	}
}
