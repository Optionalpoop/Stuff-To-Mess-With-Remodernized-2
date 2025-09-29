
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.stmwr.fluid.types.IrradiatedWaterFluidType;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, StmwrMod.MODID);
	public static final RegistryObject<FluidType> IRRADIATED_WATER_TYPE = REGISTRY.register("irradiated_water", () -> new IrradiatedWaterFluidType());
}
