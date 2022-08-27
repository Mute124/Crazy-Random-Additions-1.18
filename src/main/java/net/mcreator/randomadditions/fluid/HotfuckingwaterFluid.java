
package net.mcreator.randomadditions.fluid;

public abstract class HotfuckingwaterFluid extends ForgeFlowingFluid {

	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RandomAdditionsModFluids.HOTFUCKINGWATER,
			RandomAdditionsModFluids.FLOWING_HOTFUCKINGWATER,
			FluidAttributes
					.builder(new ResourceLocation("random_additions:blocks/water_still"), new ResourceLocation("random_additions:blocks/water_flow"))

					.density(1001)

					.gaseous()

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava"))))
			.explosionResistance(100f).canMultiply().tickRate(1)

			.slopeFindDistance(10).bucket(RandomAdditionsModItems.HOTFUCKINGWATER_BUCKET)
			.block(() -> (LiquidBlock) RandomAdditionsModBlocks.HOTFUCKINGWATER.get());

	private HotfuckingwaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends HotfuckingwaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HotfuckingwaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}

}
