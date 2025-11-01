
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.stmwr.entity.WeaselWormEntity;

public class WeaselWormRenderer extends MobRenderer<WeaselWormEntity, SilverfishModel<WeaselWormEntity>> {
	public WeaselWormRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeaselWormEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/weaselworm.png");
	}
}
