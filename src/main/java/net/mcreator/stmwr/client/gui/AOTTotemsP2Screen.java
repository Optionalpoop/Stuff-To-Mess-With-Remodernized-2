package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.AOTTotemsP2Menu;
import net.mcreator.stmwr.network.AOTTotemsP2ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AOTTotemsP2Screen extends AbstractContainerScreen<AOTTotemsP2Menu> {
	private final static HashMap<String, Object> guistate = AOTTotemsP2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_health_boost_ii;
	Button button_jump_boost_ii;
	Button button_haste_ii;
	Button button_strength_ii;
	Button button_regeneration_ii;

	public AOTTotemsP2Screen(AOTTotemsP2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/aot_totems_p_2.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.aot_totems_p_2.label_2"), 83, 180, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_empty"), e -> {
		}).bounds(this.leftPos + 115, this.topPos + 174, 51, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_empty1"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP2ButtonMessage(1, x, y, z));
				AOTTotemsP2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 174, 51, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_health_boost_ii = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_health_boost_ii"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP2ButtonMessage(2, x, y, z));
				AOTTotemsP2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 4, 103, 20).build();
		guistate.put("button:button_health_boost_ii", button_health_boost_ii);
		this.addRenderableWidget(button_health_boost_ii);
		button_jump_boost_ii = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_jump_boost_ii"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP2ButtonMessage(3, x, y, z));
				AOTTotemsP2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 25, 92, 20).build();
		guistate.put("button:button_jump_boost_ii", button_jump_boost_ii);
		this.addRenderableWidget(button_jump_boost_ii);
		button_haste_ii = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_haste_ii"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP2ButtonMessage(4, x, y, z));
				AOTTotemsP2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 98, this.topPos + 25, 66, 20).build();
		guistate.put("button:button_haste_ii", button_haste_ii);
		this.addRenderableWidget(button_haste_ii);
		button_strength_ii = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_strength_ii"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP2ButtonMessage(5, x, y, z));
				AOTTotemsP2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 46, 82, 20).build();
		guistate.put("button:button_strength_ii", button_strength_ii);
		this.addRenderableWidget(button_strength_ii);
		button_regeneration_ii = Button.builder(Component.translatable("gui.stmwr.aot_totems_p_2.button_regeneration_ii"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new AOTTotemsP2ButtonMessage(6, x, y, z));
				AOTTotemsP2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 67, 103, 20).build();
		guistate.put("button:button_regeneration_ii", button_regeneration_ii);
		this.addRenderableWidget(button_regeneration_ii);
	}
}
