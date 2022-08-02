
package net.mcreator.randomadditions.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModItems;
import net.minecraft.world.level.Level;

import java.util.List;

public class Bismuth_toolsSwordItem extends SwordItem {
	public Bismuth_toolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 614;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 27;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RandomAdditionsModItems.BISMUTH.get()));
			}
		}, 3, -3.2999999999999999f, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOM_ADDITIONS_WEAPONS));
	}
	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if (Screen.hasShiftDown()) {
			list.add(new TextComponent("Shiny!"));
		} else {
			list.add(new TextComponent("Hold SHIFT to see more info"));
		}

	}
}
