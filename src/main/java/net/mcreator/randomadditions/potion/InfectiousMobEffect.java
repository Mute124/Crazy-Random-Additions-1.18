
package net.mcreator.randomadditions.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.randomadditions.procedures.InfectiousOnEffectActiveTickProcedure;
import net.mcreator.randomadditions.procedures.InfectiousEffectStartedappliedProcedure;
import net.mcreator.randomadditions.procedures.InfectiousEffectExpiresProcedure;

public class InfectiousMobEffect extends MobEffect {
	public InfectiousMobEffect() {
		super(MobEffectCategory.HARMFUL, -13369447);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_additions.infectious";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		InfectiousEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		InfectiousOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		InfectiousEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
