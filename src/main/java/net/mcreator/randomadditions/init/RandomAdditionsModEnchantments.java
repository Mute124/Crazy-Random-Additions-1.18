
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.randomadditions.enchantment.Test03Enchantment;
import net.mcreator.randomadditions.RandomAdditionsMod;

public class RandomAdditionsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RandomAdditionsMod.MODID);
	public static final RegistryObject<Enchantment> TEST_03 = REGISTRY.register("test_03", () -> new Test03Enchantment());
}
