
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.randomadditions.world.features.ores.MagmaOreFeature;
import net.mcreator.randomadditions.world.features.ores.BorgiumOreFeature;
import net.mcreator.randomadditions.world.features.ores.BismuthOreFeature;
import net.mcreator.randomadditions.world.features.SprucecabinFeature;
import net.mcreator.randomadditions.world.features.OldobliskFeature;
import net.mcreator.randomadditions.world.features.CampfireFeature;
import net.mcreator.randomadditions.RandomAdditionsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class RandomAdditionsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RandomAdditionsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> BISMUTH_ORE = register("bismuth_ore", BismuthOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BismuthOreFeature.GENERATE_BIOMES, BismuthOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGMA_ORE = register("magma_ore", MagmaOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MagmaOreFeature.GENERATE_BIOMES, MagmaOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BORGIUM_ORE = register("borgium_ore", BorgiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BorgiumOreFeature.GENERATE_BIOMES, BorgiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OLDOBLISK = register("oldoblisk", OldobliskFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OldobliskFeature.GENERATE_BIOMES, OldobliskFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAMPFIRE = register("campfire", CampfireFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CampfireFeature.GENERATE_BIOMES, CampfireFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPRUCECABIN = register("sprucecabin", SprucecabinFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, SprucecabinFeature.GENERATE_BIOMES, SprucecabinFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
