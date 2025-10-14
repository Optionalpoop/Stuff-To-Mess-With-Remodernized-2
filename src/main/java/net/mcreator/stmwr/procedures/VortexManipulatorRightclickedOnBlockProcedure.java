package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModBlocks;

public class VortexManipulatorRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StmwrModBlocks.WARP_BRICK.get()) {
			itemstack.getOrCreateTag().putDouble("warpbrickx", x);
			itemstack.getOrCreateTag().putDouble("warpbricky", y);
			itemstack.getOrCreateTag().putDouble("warpbrickz", z);
			itemstack.getOrCreateTag().putString("warpbrickdimension", ("" + (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD))));
		}
	}
}
