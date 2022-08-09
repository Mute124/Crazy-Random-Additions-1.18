
package net.mcreator.randomadditions.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.randomadditions.init.RandomAdditionsModItems;

public class Test03Enchantment extends Enchantment {
	public Test03Enchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.SHARPNESS)
			return true;
		if (ench == Enchantments.SMITE)
			return true;
		if (ench == Enchantments.BANE_OF_ARTHROPODS)
			return true;
		if (ench == Enchantments.KNOCKBACK)
			return true;
		if (ench == Enchantments.MOB_LOOTING)
			return true;
		if (ench == Enchantments.SWEEPING_EDGE)
			return true;
		if (ench == Enchantments.BLOCK_EFFICIENCY)
			return true;
		if (ench == Enchantments.FIRE_ASPECT)
			return true;
		if (ench == Enchantments.UNBREAKING)
			return true;
		if (ench == Enchantments.BLOCK_FORTUNE)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == RandomAdditionsModItems.BORGIUM_SWORD.get())
			return true;
		if (stack.getItem() == RandomAdditionsModItems.BORGIUM_AXE.get())
			return true;
		if (stack.getItem() == RandomAdditionsModItems.BISMUTH_TOOLS_SWORD.get())
			return true;
		if (stack.getItem() == RandomAdditionsModItems.BISMUTH_TOOLS_AXE.get())
			return true;
		if (stack.getItem() == Items.DIAMOND_SWORD)
			return true;
		if (stack.getItem() == Items.DIAMOND_AXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_SWORD)
			return true;
		if (stack.getItem() == Items.NETHERITE_AXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_SWORD)
			return true;
		if (stack.getItem() == Items.GOLDEN_AXE)
			return true;
		if (stack.getItem() == Items.IRON_SWORD)
			return true;
		if (stack.getItem() == Items.IRON_AXE)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
