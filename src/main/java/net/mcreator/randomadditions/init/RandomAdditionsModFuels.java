
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class RandomAdditionsModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == RandomAdditionsModItems.MAGMA_INGOT.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == RandomAdditionsModBlocks.MAGMA_BLOCK.get().asItem())
			event.setBurnTime(9000);
	}
}
