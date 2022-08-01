
package net.mcreator.randomadditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModItems;

public class BorgiumHoeItem extends HoeItem {
	public BorgiumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RandomAdditionsModItems.BORGIUM_DUST.get()));
			}
		}, 0, -3f, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOM_ADDITIONSTOOLS));
	}
}
