
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.stmwr.entity.GoolingEntity;

public class GoolingRenderer extends MobRenderer<GoolingEntity, SilverfishModel<GoolingEntity>> {
	public GoolingRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoolingEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/gooling.png");
	}
}
