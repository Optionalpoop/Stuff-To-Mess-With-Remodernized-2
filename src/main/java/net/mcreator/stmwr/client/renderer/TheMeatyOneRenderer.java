
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.stmwr.entity.TheMeatyOneEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TheMeatyOneRenderer extends MobRenderer<TheMeatyOneEntity, CowModel<TheMeatyOneEntity>> {
	public TheMeatyOneRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	protected void scale(TheMeatyOneEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheMeatyOneEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/themeatyone.png");
	}
}
