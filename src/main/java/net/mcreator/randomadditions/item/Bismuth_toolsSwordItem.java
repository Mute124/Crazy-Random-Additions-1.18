
package net.mcreator.randomadditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModItems;

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
}
