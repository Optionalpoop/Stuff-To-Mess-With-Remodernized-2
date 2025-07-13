
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.stmwr.entity.PikachuEntity;

public class PikachuRenderer extends MobRenderer<PikachuEntity, PigModel<PikachuEntity>> {
	public PikachuRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PikachuEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/pikachu.png");
	}
}
