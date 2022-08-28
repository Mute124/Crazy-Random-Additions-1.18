
package net.mcreator.randomadditions.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
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
		return ench == Enchantments.SHARPNESS || ench == Enchantments.SMITE || ench == Enchantments.BANE_OF_ARTHROPODS
				|| ench == Enchantments.KNOCKBACK || ench == Enchantments.MOB_LOOTING || ench == Enchantments.SWEEPING_EDGE
				|| ench == Enchantments.BLOCK_EFFICIENCY || ench == Enchantments.FIRE_ASPECT || ench == Enchantments.UNBREAKING
				|| ench == Enchantments.BLOCK_FORTUNE;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return item == RandomAdditionsModItems.BORGIUM_SWORD.get() || item == RandomAdditionsModItems.BORGIUM_AXE.get()
				|| item == RandomAdditionsModItems.BISMUTH_TOOLS_SWORD.get() || item == RandomAdditionsModItems.BISMUTH_TOOLS_AXE.get()
				|| item == Items.DIAMOND_SWORD || item == Items.DIAMOND_AXE || item == Items.NETHERITE_SWORD || item == Items.NETHERITE_AXE
				|| item == Items.GOLDEN_SWORD || item == Items.GOLDEN_AXE || item == Items.IRON_SWORD || item == Items.IRON_AXE;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
