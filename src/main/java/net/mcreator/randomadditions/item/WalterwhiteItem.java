
package net.mcreator.randomadditions.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class WalterwhiteItem extends Item {

	public WalterwhiteItem() {
		super(new Item.Properties().tab(RandomAdditionsModTabs.TAB_ADITIONALADDITIONSMISC).stacksTo(1).fireResistant().rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(-100).saturationMod(-100f).alwaysEat()

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("W A L T E R"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(RandomAdditionsModItems.WALTERWHITE.get());
		super.finishUsingItem(itemstack, world, entity);

		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WalterwhiteLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}

}
