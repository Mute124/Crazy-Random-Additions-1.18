
package net.mcreator.randomadditions.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HotfuckingwaterBlock extends LiquidBlock {
	public HotfuckingwaterBlock() {
		super(() -> (FlowingFluid) RandomAdditionsModFluids.HOTFUCKINGWATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}