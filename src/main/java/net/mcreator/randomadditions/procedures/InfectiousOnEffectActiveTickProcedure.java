package net.mcreator.randomadditions.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;

import java.util.Random;

public class InfectiousOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (Mth.nextDouble(new Random(), 1, 10)); index0++) {
			entity.hurt(DamageSource.OUT_OF_WORLD, (float) Mth.nextDouble(new Random(), 2, 12));
		}
	}
}
