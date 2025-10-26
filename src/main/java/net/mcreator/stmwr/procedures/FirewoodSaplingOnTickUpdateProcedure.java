package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FirewoodSaplingOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:frosted_peaks")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:frozen_forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:frozen_sea")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:icelands"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:firewood_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:snowy_sands"))) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("stmwr", "firewoodtree"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
