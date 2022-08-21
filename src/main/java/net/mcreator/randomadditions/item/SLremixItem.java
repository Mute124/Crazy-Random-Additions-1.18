
package net.mcreator.randomadditions.item;

import net.minecraft.network.chat.Component;

public class SLremixItem extends RecordItem {

	public SLremixItem() {
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
		list.add(new TextComponent("Made by hyperexecube in like 20 minutes"));
	}

}
