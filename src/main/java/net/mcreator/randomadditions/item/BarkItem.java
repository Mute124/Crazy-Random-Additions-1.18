
package net.mcreator.randomadditions.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;

public class BarkItem extends Item {
	public BarkItem() {
		super(new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
