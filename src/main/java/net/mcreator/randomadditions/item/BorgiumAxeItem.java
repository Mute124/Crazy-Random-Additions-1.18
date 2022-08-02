
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

public class BorgiumAxeItem extends AxeItem {
	public BorgiumAxeItem() {
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
		}, 1, -3f, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOM_ADDITIONSTOOLS));
	}
	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if (Screen.hasShiftDown()) {
			list.add(new TextComponent("tasty"));
		} else {
			list.add(new TextComponent("Hold SHIFT to see more info"));
		}

	}
}
