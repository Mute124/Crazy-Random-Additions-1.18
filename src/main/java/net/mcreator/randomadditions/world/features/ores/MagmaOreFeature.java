
package net.mcreator.randomadditions.world.features.ores;

public class MagmaOreFeature extends OreFeature {

	public static MagmaOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MagmaOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("random_additions:magma_ore", FEATURE,
				new OreConfiguration(MagmaOreFeatureRuleTest.INSTANCE, RandomAdditionsModBlocks.MAGMA_ORE.get().defaultBlockState(), 3));
		PLACED_FEATURE = PlacementUtils.register("random_additions:magma_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(5), InSquarePlacement.spread(),
						HeightRangePlacement.triangle(VerticalAnchor.absolute(1), VerticalAnchor.absolute(33)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public MagmaOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class MagmaOreFeatureRuleTest extends RuleTest {

		static final MagmaOreFeatureRuleTest INSTANCE = new MagmaOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<MagmaOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<MagmaOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("random_additions:magma_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE, Blocks.DIORITE, Blocks.GRANITE, Blocks.ANDESITE, Blocks.STONE, Blocks.IRON_ORE, Blocks.COAL_ORE,
						Blocks.REDSTONE_ORE, Blocks.REDSTONE_ORE, Blocks.GOLD_ORE, Blocks.LAPIS_ORE, Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
