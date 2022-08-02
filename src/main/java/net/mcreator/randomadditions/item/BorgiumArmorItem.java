
package net.mcreator.randomadditions.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.randomadditions.init.RandomAdditionsModTabs;
import net.mcreator.randomadditions.init.RandomAdditionsModItems;

import java.util.List;

public abstract class BorgiumArmorItem extends ArmorItem {
	public BorgiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 12, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RandomAdditionsModItems.BORGIUM_DUST.get()));
			}

			@Override
			public String getName() {
				return "borgium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends BorgiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/borgium_layer_1.png";
		}
	}

	public static class Chestplate extends BorgiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/borgium_layer_1.png";
		}
	}

	public static class Leggings extends BorgiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/borgium_layer_2.png";
		}
	}

	public static class Boots extends BorgiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RandomAdditionsModTabs.TAB_RANDOMADDITIONSARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_additions:textures/models/armor/borgium_layer_1.png";
		}
	}
	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if (Screen.hasShiftDown()) {
			list.add(new TextComponent("Tasty!"));
		} else {
			list.add(new TextComponent("Hold SHIFT to see more info"));
		}

	}
}
