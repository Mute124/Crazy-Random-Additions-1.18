
package net.mcreator.randomadditions.item;

import net.minecraft.network.chat.Component;

public class AGSTUltimatumItem extends RecordItem {

	public AGSTUltimatumItem() {
		super(0, RandomAdditionsModSounds.REGISTRY.get(new ResourceLocation("random_additions:ultimatumremixed")),
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
		list.add(new TextComponent("Original made by epidemic sounds"));
	}

}
