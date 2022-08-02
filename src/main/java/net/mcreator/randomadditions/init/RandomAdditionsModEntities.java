
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.randomadditions.entity.TheSquelcherEntityProjectile;
import net.mcreator.randomadditions.entity.TheSquelcherEntity;
import net.mcreator.randomadditions.entity.GunEntity;
import net.mcreator.randomadditions.entity.GrenadeEntity;
import net.mcreator.randomadditions.RandomAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomAdditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RandomAdditionsMod.MODID);
	public static final RegistryObject<EntityType<GunEntity>> GUN = register("projectile_gun",
			EntityType.Builder.<GunEntity>of(GunEntity::new, MobCategory.MISC).setCustomClientFactory(GunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrenadeEntity>> GRENADE = register("projectile_grenade",
			EntityType.Builder.<GrenadeEntity>of(GrenadeEntity::new, MobCategory.MISC).setCustomClientFactory(GrenadeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TheSquelcherEntity>> THE_SQUELCHER = register("the_squelcher",
			EntityType.Builder.<TheSquelcherEntity>of(TheSquelcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(TheSquelcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheSquelcherEntityProjectile>> THE_SQUELCHER_PROJECTILE = register("projectile_the_squelcher",
			EntityType.Builder.<TheSquelcherEntityProjectile>of(TheSquelcherEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(TheSquelcherEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheSquelcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THE_SQUELCHER.get(), TheSquelcherEntity.createAttributes().build());
	}
}
