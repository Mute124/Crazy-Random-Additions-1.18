package net.mcreator.randomadditions.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class InfectiousEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.DRAGON_BREATH, 2);
	}
}
