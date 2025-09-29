
package net.mcreator.stmwr.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.stmwr.init.StmwrModItems;
import net.mcreator.stmwr.init.StmwrModFluids;
import net.mcreator.stmwr.init.StmwrModFluidTypes;
import net.mcreator.stmwr.init.StmwrModBlocks;

public abstract class IrradiatedWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> StmwrModFluidTypes.IRRADIATED_WATER_TYPE.get(), () -> StmwrModFluids.IRRADIATED_WATER.get(), () -> StmwrModFluids.FLOWING_IRRADIATED_WATER.get())
			.explosionResistance(100f).tickRate(6).bucket(() -> StmwrModItems.IRRADIATED_WATER_BUCKET.get()).block(() -> (LiquidBlock) StmwrModBlocks.IRRADIATED_WATER.get());

	private IrradiatedWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SMOKE;
	}

	public static class Source extends IrradiatedWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends IrradiatedWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
