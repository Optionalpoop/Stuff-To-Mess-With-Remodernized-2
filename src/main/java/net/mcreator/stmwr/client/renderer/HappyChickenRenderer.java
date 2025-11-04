
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.stmwr.entity.HappyChickenEntity;

public class HappyChickenRenderer extends MobRenderer<HappyChickenEntity, ChickenModel<HappyChickenEntity>> {
	public HappyChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HappyChickenEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/happychicken.png");
	}
}
