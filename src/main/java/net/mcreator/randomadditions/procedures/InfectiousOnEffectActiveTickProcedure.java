package net.mcreator.randomadditions.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InfectiousOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (Mth.nextDouble(new Random(), 1, 10)); index0++) {
			entity.hurt(DamageSource.DRAGON_BREATH, (float) Mth.nextDouble(new Random(), 2, 12));
		}
	}
}
