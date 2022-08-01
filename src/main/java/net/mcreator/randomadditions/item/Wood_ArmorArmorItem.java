
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
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

public abstract class Wood_ArmorArmorItem extends ArmorItem {
	public Wood_ArmorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 6;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 2, 2, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 4;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_LOG));
			}

			@Override
			public String getName() {
				return "wood_armor_armor";
			}

			@Override
			public float getToughness() {
				return 0.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Wood_ArmorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/wood_armor_layer_1.png";
		}
	}

	public static class Chestplate extends Wood_ArmorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/wood_armor_layer_1.png";
		}
	}

	public static class Leggings extends Wood_ArmorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/wood_armor_layer_2.png";
		}
	}

	public static class Boots extends Wood_ArmorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/wood_armor_layer_1.png";
		}
	}
}
