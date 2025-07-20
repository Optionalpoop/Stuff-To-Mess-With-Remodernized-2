
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.stmwr.entity.CrusherEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class CrusherRenderer extends MobRenderer<CrusherEntity, SilverfishModel<CrusherEntity>> {
	public CrusherRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	protected void scale(CrusherEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrusherEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/crusher.png");
	}
}
