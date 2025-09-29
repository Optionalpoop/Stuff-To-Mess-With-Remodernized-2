
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.stmwr.fluid.IrradiatedWaterFluid;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, StmwrMod.MODID);
	public static final RegistryObject<FlowingFluid> IRRADIATED_WATER = REGISTRY.register("irradiated_water", () -> new IrradiatedWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_IRRADIATED_WATER = REGISTRY.register("flowing_irradiated_water", () -> new IrradiatedWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(IRRADIATED_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_IRRADIATED_WATER.get(), RenderType.translucent());
		}
	}
}
