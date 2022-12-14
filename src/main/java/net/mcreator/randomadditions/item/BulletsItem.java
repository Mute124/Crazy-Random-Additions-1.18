
package net.mcreator.randomadditions.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;

public class BulletsItem extends Item {
	public BulletsItem() {
		super(new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
