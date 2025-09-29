
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.stmwr.entity.InfectedChickenEntity;

public class InfectedChickenRenderer extends MobRenderer<InfectedChickenEntity, ChickenModel<InfectedChickenEntity>> {
	public InfectedChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InfectedChickenEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/zombie-chicken.png");
	}
}
