
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.randomadditions.potion.PoweroftheborgorMobEffect;
import net.mcreator.randomadditions.potion.ConfusionMobEffect;
import net.mcreator.randomadditions.RandomAdditionsMod;

public class RandomAdditionsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RandomAdditionsMod.MODID);
	public static final RegistryObject<MobEffect> CONFUSION = REGISTRY.register("confusion", () -> new ConfusionMobEffect());
	public static final RegistryObject<MobEffect> POWEROFTHEBORGOR = REGISTRY.register("poweroftheborgor", () -> new PoweroftheborgorMobEffect());
}
