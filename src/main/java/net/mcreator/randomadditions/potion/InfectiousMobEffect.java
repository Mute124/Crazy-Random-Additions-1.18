
package net.mcreator.randomadditions.potion;

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
		InfectiousEffectStartedappliedProcedure.execute(

		);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		InfectiousOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		InfectiousEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
