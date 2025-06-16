package net.mcreator.stmwr.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class StopProcedureProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _entity)
			_entity.getNavigation().stop();
		entity.stopRiding();
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo(x, y, z, 0);
	}
}
