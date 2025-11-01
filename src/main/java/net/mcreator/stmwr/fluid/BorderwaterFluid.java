
package net.mcreator.stmwr.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.stmwr.init.StmwrModItems;
import net.mcreator.stmwr.init.StmwrModFluids;
import net.mcreator.stmwr.init.StmwrModFluidTypes;
import net.mcreator.stmwr.init.StmwrModBlocks;

public abstract class BorderwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> StmwrModFluidTypes.BORDERWATER_TYPE.get(), () -> StmwrModFluids.BORDERWATER.get(), () -> StmwrModFluids.FLOWING_BORDERWATER.get())
			.explosionResistance(100f).bucket(() -> StmwrModItems.BORDERWATER_BUCKET.get()).block(() -> (LiquidBlock) StmwrModBlocks.BORDERWATER.get());

	private BorderwaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BorderwaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BorderwaterFluid {
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
