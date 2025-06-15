
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.stmwr.entity.AlligatorEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class AlligatorRenderer extends MobRenderer<AlligatorEntity, SilverfishModel<AlligatorEntity>> {
	public AlligatorRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	protected void scale(AlligatorEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(5f, 5f, 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlligatorEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/alligator.png");
	}
}
