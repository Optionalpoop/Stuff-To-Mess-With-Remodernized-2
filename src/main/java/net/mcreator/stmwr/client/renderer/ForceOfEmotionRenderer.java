
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.stmwr.entity.ForceOfEmotionEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class ForceOfEmotionRenderer extends HumanoidMobRenderer<ForceOfEmotionEntity, HumanoidModel<ForceOfEmotionEntity>> {
	public ForceOfEmotionRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(ForceOfEmotionEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForceOfEmotionEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/forceofemotion.png");
	}
}
