
package net.mcreator.randomadditions.world.features;

public class CoridorFeature extends Feature<NoneFeatureConfiguration> {

	public static CoridorFeature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new CoridorFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("random_additions:coridor", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("random_additions:coridor", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.NETHER);

	private StructureTemplate template = null;

	public CoridorFeature() {
		super(NoneFeatureConfiguration.CODEC);

	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;

		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("random_additions", "coridor"));

		if (template == null)
			return false;

		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 1000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);

				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);

				j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));

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
