
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModItems;
import net.mcreator.randomadditions.init.RandomAdditionsModBlocks;

public abstract class BorgiumupgradeItem extends ArmorItem {
	public BorgiumupgradeItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 5, 10, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RandomAdditionsModItems.BORGIUM_ARMOR_HELMET.get()),
						new ItemStack(RandomAdditionsModItems.BORGIUM_ARMOR_CHESTPLATE.get()),
						new ItemStack(RandomAdditionsModItems.BORGIUM_ARMOR_LEGGINGS.get()),
						new ItemStack(RandomAdditionsModItems.BORGIUM_ARMOR_BOOTS.get()),
						new ItemStack(RandomAdditionsModBlocks.BORGIUM_BLOCK.get()));
			}

			@Override
			public String getName() {
				return "borgiumupgrade";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BorgiumupgradeItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/armor__layer_1.png";
		}
	}

	public static class Chestplate extends BorgiumupgradeItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/armor__layer_1.png";
		}
	}

	public static class Leggings extends BorgiumupgradeItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/armor__layer_2.png";
		}
	}

	public static class Boots extends BorgiumupgradeItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/armor__layer_1.png";
		}
	}
}
