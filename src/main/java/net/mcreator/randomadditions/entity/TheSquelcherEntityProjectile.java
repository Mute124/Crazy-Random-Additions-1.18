
package net.mcreator.randomadditions.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.randomadditions.init.RandomAdditionsModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TheSquelcherEntityProjectile extends AbstractArrow implements ItemSupplier {
	public TheSquelcherEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(RandomAdditionsModEntities.THE_SQUELCHER_PROJECTILE.get(), world);
	}

	public TheSquelcherEntityProjectile(EntityType<? extends TheSquelcherEntityProjectile> type, Level world) {
		super(type, world);
	}

	public TheSquelcherEntityProjectile(EntityType<? extends TheSquelcherEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TheSquelcherEntityProjectile(EntityType<? extends TheSquelcherEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.COBBLED_DEEPSLATE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.COBBLED_DEEPSLATE);
	}
}
