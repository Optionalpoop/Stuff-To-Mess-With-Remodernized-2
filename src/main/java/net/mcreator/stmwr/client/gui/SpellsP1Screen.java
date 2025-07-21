package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.SpellsP1Menu;
import net.mcreator.stmwr.network.SpellsP1ButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpellsP1Screen extends AbstractContainerScreen<SpellsP1Menu> {
	private final static HashMap<String, Object> guistate = SpellsP1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_wizards_sea;
	Button button_snowy_shrapnel;

	public SpellsP1Screen(SpellsP1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/spells_p_1.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.spells_p_1.label_1"), 83, 179, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.stmwr.spells_p_1.button_empty"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new SpellsP1ButtonMessage(0, x, y, z));
				SpellsP1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.stmwr.spells_p_1.button_empty1"), e -> {
		}).bounds(this.leftPos + 122, this.topPos + 174, 46, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_wizards_sea = Button.builder(Component.translatable("gui.stmwr.spells_p_1.button_wizards_sea"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new SpellsP1ButtonMessage(2, x, y, z));
				SpellsP1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 4, 87, 20).build();
		guistate.put("button:button_wizards_sea", button_wizards_sea);
		this.addRenderableWidget(button_wizards_sea);
		button_snowy_shrapnel = Button.builder(Component.translatable("gui.stmwr.spells_p_1.button_snowy_shrapnel"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new SpellsP1ButtonMessage(3, x, y, z));
				SpellsP1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 25, 98, 20).build();
		guistate.put("button:button_snowy_shrapnel", button_snowy_shrapnel);
		this.addRenderableWidget(button_snowy_shrapnel);
	}
}
