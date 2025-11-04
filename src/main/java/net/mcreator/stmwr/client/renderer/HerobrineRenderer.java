
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.stmwr.entity.HerobrineEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class HerobrineRenderer extends HumanoidMobRenderer<HerobrineEntity, HumanoidModel<HerobrineEntity>> {
	public HerobrineRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(HerobrineEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2.5f, 2.5f, 2.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HerobrineEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/herobrine.png");
	}
}
