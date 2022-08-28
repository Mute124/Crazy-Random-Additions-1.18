
package net.mcreator.randomadditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.randomadditions.procedures.BugDrinkPlayerFinishesUsingItemProcedure;
import net.mcreator.randomadditions.init.RandomAdditionsModTabs;

import java.util.List;

public class BugDrinkItem extends Item {
	public BugDrinkItem() {
		super(new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOM_ADDITIONS_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.2f).alwaysEat()

						.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The lord has given us bug drink!"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BugDrinkPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
