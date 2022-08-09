package net.mcreator.randomadditions.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.randomadditions.init.RandomAdditionsModMobEffects;

public class EnchantedborgorFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(RandomAdditionsModMobEffects.CONFUSION.get(), 60, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(RandomAdditionsModMobEffects.CONFUSION.get(), 60, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(RandomAdditionsModMobEffects.CONFUSION.get(), 60, 1, (false), (false)));
	}
}
