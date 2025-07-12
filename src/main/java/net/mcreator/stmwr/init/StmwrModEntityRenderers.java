
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stmwr.client.renderer.SteveCowRenderer;
import net.mcreator.stmwr.client.renderer.AlligatorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StmwrModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StmwrModEntities.ALLIGATOR.get(), AlligatorRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.STEVE_COW.get(), SteveCowRenderer::new);
	}
}
