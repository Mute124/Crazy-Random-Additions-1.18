
package net.mcreator.randomadditions.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import java.util.Set;
import java.util.List;

public class InfectedruinsFeature extends Feature<NoneFeatureConfiguration> {
	public static InfectedruinsFeature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new InfectedruinsFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("random_additions:infectedruins", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("random_additions:infectedruins", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("warm_ocean"), new ResourceLocation("mushroom_fields"),
			new ResourceLocation("sunflower_plains"), new ResourceLocation("end_midlands"), new ResourceLocation("flower_forest"),
			new ResourceLocation("lush_caves"), new ResourceLocation("the_end"), new ResourceLocation("cold_ocean"),
			new ResourceLocation("lukewarm_ocean"), new ResourceLocation("ice_spikes"), new ResourceLocation("dark_forest"),
			new ResourceLocation("stony_peaks"), new ResourceLocation("savanna"), new ResourceLocation("snowy_beach"),
			new ResourceLocation("frozen_ocean"), new ResourceLocation("savanna_plateau"), new ResourceLocation("snowy_plains"),
			new ResourceLocation("dripstone_caves"), new ResourceLocation("jagged_peaks"), new ResourceLocation("eroded_badlands"),
			new ResourceLocation("badlands"), new ResourceLocation("windswept_hills"), new ResourceLocation("ocean"),
			new ResourceLocation("wooded_badlands"), new ResourceLocation("windswept_savanna"), new ResourceLocation("jungle"),
			new ResourceLocation("warped_forest"), new ResourceLocation("frozen_river"), new ResourceLocation("forest"),
			new ResourceLocation("stony_shore"), new ResourceLocation("sparse_jungle"), new ResourceLocation("deep_lukewarm_ocean"),
			new ResourceLocation("birch_forest"), new ResourceLocation("snowy_slopes"), new ResourceLocation("deep_ocean"),
			new ResourceLocation("nether_wastes"), new ResourceLocation("deep_frozen_ocean"), new ResourceLocation("soul_sand_valley"),
			new ResourceLocation("bamboo_jungle"), new ResourceLocation("small_end_islands"), new ResourceLocation("plains"),
			new ResourceLocation("frozen_peaks"), new ResourceLocation("end_highlands"), new ResourceLocation("meadow"),
			new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("end_barrens"), new ResourceLocation("basalt_deltas"),
			new ResourceLocation("taiga"), new ResourceLocation("crimson_forest"), new ResourceLocation("swamp"), new ResourceLocation("snowy_taiga"),
			new ResourceLocation("deep_cold_ocean"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("grove"),
			new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("beach"), new ResourceLocation("the_void"),
			new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("river"), new ResourceLocation("desert"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private StructureTemplate template = null;

	public InfectedruinsFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("random_additions", "infectedruins"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 10000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
