
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.stmwr.entity.SatanEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SatanRenderer extends HumanoidMobRenderer<SatanEntity, HumanoidModel<SatanEntity>> {
	public SatanRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(SatanEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SatanEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/satan.png");
	}
}
