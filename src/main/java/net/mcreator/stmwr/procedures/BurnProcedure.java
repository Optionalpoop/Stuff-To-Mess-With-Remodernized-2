package net.mcreator.stmwr.procedures;

import net.minecraft.world.entity.Entity;

public class BurnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
