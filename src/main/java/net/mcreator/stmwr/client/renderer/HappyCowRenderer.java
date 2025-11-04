
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.stmwr.entity.HappyCowEntity;

public class HappyCowRenderer extends MobRenderer<HappyCowEntity, CowModel<HappyCowEntity>> {
	public HappyCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HappyCowEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/happycow.png");
	}
}
