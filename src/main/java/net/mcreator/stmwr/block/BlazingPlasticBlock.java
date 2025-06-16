
package net.mcreator.stmwr.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BlazingPlasticBlock extends FallingBlock {
	public BlazingPlasticBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(0.5f, 50f).friction(1f).speedFactor(1.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
