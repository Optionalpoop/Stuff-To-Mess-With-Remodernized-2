
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.stmwr.entity.GiantSteveCowEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class GiantSteveCowRenderer extends MobRenderer<GiantSteveCowEntity, CowModel<GiantSteveCowEntity>> {
	public GiantSteveCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	protected void scale(GiantSteveCowEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(5f, 5f, 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantSteveCowEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/steve-cow.png");
	}
}
