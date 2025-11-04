package net.mcreator.stmwr.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stmwr.world.inventory.EyeGuideGUIMenu;
import net.mcreator.stmwr.network.EyeGuideGUIButtonMessage;
import net.mcreator.stmwr.StmwrMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EyeGuideGUIScreen extends AbstractContainerScreen<EyeGuideGUIMenu> {
	private final static HashMap<String, Object> guistate = EyeGuideGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;

	public EyeGuideGUIScreen(EyeGuideGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("stmwr:textures/screens/eye_guide_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_current_order"), 11, 29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_eye_of_the_stevecow"), 24, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_eye_of_time"), 84, 59, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_wizards_eye"), 101, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_empty"), 119, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_empty1"), 136, 49, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_empty2"), 156, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_empty3"), 156, 42, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.stmwr.eye_guide_gui.label_empty4"), 156, 53, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.stmwr.eye_guide_gui.button_back"), e -> {
			if (true) {
				StmwrMod.PACKET_HANDLER.sendToServer(new EyeGuideGUIButtonMessage(0, x, y, z));
				EyeGuideGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 5, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
