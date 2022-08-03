package net.mcreator.randomadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.randomadditions.init.RandomAdditionsModMobEffects;

import java.util.Random;

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
