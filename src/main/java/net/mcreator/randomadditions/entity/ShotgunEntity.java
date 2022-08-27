
package net.mcreator.randomadditions.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ShotgunEntity extends AbstractArrow implements ItemSupplier {

	public ShotgunEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(RandomAdditionsModEntities.SHOTGUN.get(), world);
	}

	public ShotgunEntity(EntityType<? extends ShotgunEntity> type, Level world) {
		super(type, world);
	}

	public ShotgunEntity(EntityType<? extends ShotgunEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ShotgunEntity(EntityType<? extends ShotgunEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.COBBLESTONE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();

		if (this.inGround)
			this.discard();
	}

	public static ShotgunEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ShotgunEntity entityarrow = new ShotgunEntity(RandomAdditionsModEntities.SHOTGUN.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static ShotgunEntity shoot(LivingEntity entity, LivingEntity target) {
		ShotgunEntity entityarrow = new ShotgunEntity(RandomAdditionsModEntities.SHOTGUN.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 4f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6.3);
		entityarrow.setKnockback(2);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
