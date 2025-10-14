package net.mcreator.stmwr.procedures;

import net.minecraft.world.entity.Entity;

public class LongFallBootsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
