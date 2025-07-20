package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CrusherOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR) == false) {
			if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.BEDROCK) == false) {
				if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.OBSIDIAN) == false) {
					world.destroyBlock(BlockPos.containing(x + 1, y, z), false);
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR) == false) {
			if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.OBSIDIAN) == false) {
				if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.BEDROCK) == false) {
					world.destroyBlock(BlockPos.containing(x, y, z + 1), false);
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.BEDROCK) == false) {
			if (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR) == false) {
				if (((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.OBSIDIAN) == false) {
					world.destroyBlock(BlockPos.containing(x, y, z - 1), false);
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.OBSIDIAN) == false) {
			if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.BEDROCK) == false) {
				if (((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR) == false) {
					world.destroyBlock(BlockPos.containing(x - 1, y, z), false);
				}
			}
		}
	}
}
