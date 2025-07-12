package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.stmwr.StmwrMod;

public class StevumArmorHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		StmwrMod.queueServerWork(20, () -> {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(1);
			}
		});
	}
}
