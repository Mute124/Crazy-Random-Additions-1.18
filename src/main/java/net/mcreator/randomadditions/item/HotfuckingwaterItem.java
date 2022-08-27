
package net.mcreator.randomadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModFluids;

public class HotfuckingwaterItem extends BucketItem {
	public HotfuckingwaterItem() {
		super(RandomAdditionsModFluids.HOTFUCKINGWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE)
				.tab(RandomAdditionsModTabs.TAB_ADITIONALADDITIONSMISC));
	}
}
