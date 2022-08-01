package net.mcreator.randomadditions.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.randomadditions.init.RandomAdditionsModItems;

public class BismuthtoolsAxeRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Blocks.OAK_LOG.defaultBlockState().getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(RandomAdditionsModItems.BARK.get());
				_setstack.setCount((int) Math.random());
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
