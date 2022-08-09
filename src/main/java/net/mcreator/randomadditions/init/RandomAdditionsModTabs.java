
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomAdditionsModTabs {
	public static CreativeModeTab TAB_RANDOM_ADDITIONSTOOLS;
	public static CreativeModeTab TAB_RANDOM_ADDITIONS_FOOD;
	public static CreativeModeTab TAB_RANDOM_ADDITIONS_WEAPONS;
	public static CreativeModeTab TAB_RANDOMADDITIONSARMOR;
	public static CreativeModeTab TAB_RANDOMADDITIONS_ITEMS;
	public static CreativeModeTab TAB_RANDOM_ADDITIONSBLOCKS;
	public static CreativeModeTab TAB_ADITIONALADDITIONSMISC;

	public static void load() {
		TAB_RANDOM_ADDITIONSTOOLS = new CreativeModeTab("tabrandom_additionstools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomAdditionsModItems.BISMUTH_TOOLS_PICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RANDOM_ADDITIONS_FOOD = new CreativeModeTab("tabrandom_additions_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.BREAD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RANDOM_ADDITIONS_WEAPONS = new CreativeModeTab("tabrandom_additions_weapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomAdditionsModItems.BISMUTH_TOOLS_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_RANDOMADDITIONSARMOR = new CreativeModeTab("tabrandomadditionsarmor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomAdditionsModItems.WOOD_ARMOR_ARMOR_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RANDOMADDITIONS_ITEMS = new CreativeModeTab("tabrandomadditions_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomAdditionsModItems.BISMUTH.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_RANDOM_ADDITIONSBLOCKS = new CreativeModeTab("tabrandom_additionsblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomAdditionsModBlocks.INFECTED_GRASS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ADITIONALADDITIONSMISC = new CreativeModeTab("tabaditionaladditionsmisc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomAdditionsModItems.AGST_ULTIMATUM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
