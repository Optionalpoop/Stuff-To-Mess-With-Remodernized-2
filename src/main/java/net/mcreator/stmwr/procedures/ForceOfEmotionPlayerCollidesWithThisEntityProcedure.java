package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModEntities;

public class ForceOfEmotionPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		double j = 0;
		String tag = "";
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = StmwrModEntities.LOVE_MITE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}
