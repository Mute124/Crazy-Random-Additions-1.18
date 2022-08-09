
package net.mcreator.randomadditions.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModSounds;

import java.util.List;

public class AGSTUltimatumItem extends RecordItem {
	public AGSTUltimatumItem() {
		super(0, RandomAdditionsModSounds.REGISTRY.get(new ResourceLocation("random_additions:scpsltrackbutdiffrent")),
				new Item.Properties().tab(RandomAdditionsModTabs.TAB_ADITIONALADDITIONSMISC).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("not really diffrent from the original but still different"));
	}
}
