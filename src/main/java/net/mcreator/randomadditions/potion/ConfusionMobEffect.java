
package net.mcreator.randomadditions.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.randomadditions.procedures.ConfusionPotionStartedappliedProcedure;

public class ConfusionMobEffect extends MobEffect {
	public ConfusionMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777165);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_additions.confusion";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ConfusionPotionStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
