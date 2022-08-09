
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.randomadditions.RandomAdditionsMod;

public class RandomAdditionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, RandomAdditionsMod.MODID);
	public static final RegistryObject<Potion> CONFUSION = REGISTRY.register("confusion",
			() -> new Potion(new MobEffectInstance(RandomAdditionsModMobEffects.CONFUSION.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POWEROFTHEBORGOR = REGISTRY.register("poweroftheborgor",
			() -> new Potion(new MobEffectInstance(RandomAdditionsModMobEffects.POWEROFTHEBORGOR.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> INFECTIOUSPOTION = REGISTRY.register("infectiouspotion",
			() -> new Potion(new MobEffectInstance(RandomAdditionsModMobEffects.INFECTIOUS.get(), 6600, 2, true, true)));
}
