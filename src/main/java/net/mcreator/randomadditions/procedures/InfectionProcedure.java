package net.mcreator.randomadditions.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InfectionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("random_additions:theinfection")
				.equals(world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).value().getRegistryName())) {
			if (Mth.nextDouble(new Random(), 1, 5) == 5) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(RandomAdditionsModMobEffects.INFECTIOUS.get(), 80, 2));
			} else {
				entity.setSecondsOnFire(0);
			}
		} else {
			entity.setSecondsOnFire(0);
		}
	}
}
