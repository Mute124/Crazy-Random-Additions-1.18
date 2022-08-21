
package net.mcreator.randomadditions.item;

import net.minecraft.network.chat.Component;

public class HotfuckingwaterItem extends BucketItem {

	public HotfuckingwaterItem() {
		super(RandomAdditionsModFluids.HOTFUCKINGWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(RandomAdditionsModTabs.TAB_ADITIONALADDITIONSMISC));
	}

}
