
package net.mcreator.randomadditions.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.randomadditions.procedures.PoweroftheborgorPotionStartedappliedProcedure;
import net.mcreator.randomadditions.procedures.PoweroftheborgorPotionExpiresProcedure;

public class PoweroftheborgorMobEffect extends MobEffect {
	public PoweroftheborgorMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12747767);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_additions.poweroftheborgor";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		PoweroftheborgorPotionStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoweroftheborgorPotionStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PoweroftheborgorPotionExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
