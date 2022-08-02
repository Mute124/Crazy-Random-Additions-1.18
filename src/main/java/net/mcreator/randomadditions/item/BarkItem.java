
package net.mcreator.randomadditions.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.minecraft.world.level.Level;

import java.util.List;

public class BarkItem extends Item {
	public BarkItem() {
		super(new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if (Screen.hasShiftDown()) {
			list.add(new TextComponent("A Tree's Skin!"));
		} else {
			list.add(new TextComponent("Hold SHIFT to see more info"));
		}

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
