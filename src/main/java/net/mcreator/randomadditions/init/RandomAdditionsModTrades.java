
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.randomadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RandomAdditionsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(RandomAdditionsModItems.BUG_DRINK.get(), 5),
					new ItemStack(Items.EMERALD, 32), new ItemStack(RandomAdditionsModItems.WALTERWHITE.get()), 1, 200, 0.05f));
		}
	}
}
