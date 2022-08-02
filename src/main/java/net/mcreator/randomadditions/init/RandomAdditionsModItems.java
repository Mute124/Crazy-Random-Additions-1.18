
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randomadditions.item.Wood_ArmorArmorItem;
import net.mcreator.randomadditions.item.TechnosCrownItem;
import net.mcreator.randomadditions.item.ShotgunItem;
import net.mcreator.randomadditions.item.SawItem;
import net.mcreator.randomadditions.item.MagmaIngotItem;
import net.mcreator.randomadditions.item.HeartItem;
import net.mcreator.randomadditions.item.GunItem;
import net.mcreator.randomadditions.item.GrenadethrownitemItem;
import net.mcreator.randomadditions.item.GrenadeItem;
import net.mcreator.randomadditions.item.EnchantedborgorItem;
import net.mcreator.randomadditions.item.DrillbitItem;
import net.mcreator.randomadditions.item.ChainsawItem;
import net.mcreator.randomadditions.item.BulletsItem;
import net.mcreator.randomadditions.item.BugDrinkItem;
import net.mcreator.randomadditions.item.BorgiumSwordItem;
import net.mcreator.randomadditions.item.BorgiumShovelItem;
import net.mcreator.randomadditions.item.BorgiumPickaxeItem;
import net.mcreator.randomadditions.item.BorgiumHoeItem;
import net.mcreator.randomadditions.item.BorgiumDustItem;
import net.mcreator.randomadditions.item.BorgiumAxeItem;
import net.mcreator.randomadditions.item.BorgiumArmorItem;
import net.mcreator.randomadditions.item.Bismuth_toolsSwordItem;
import net.mcreator.randomadditions.item.Bismuth_toolsShovelItem;
import net.mcreator.randomadditions.item.Bismuth_toolsPickaxeItem;
import net.mcreator.randomadditions.item.Bismuth_toolsHoeItem;
import net.mcreator.randomadditions.item.Bismuth_toolsAxeItem;
import net.mcreator.randomadditions.item.BismuthItem;
import net.mcreator.randomadditions.item.BarkItem;
import net.mcreator.randomadditions.RandomAdditionsMod;

public class RandomAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomAdditionsMod.MODID);
	public static final RegistryObject<Item> BISMUTH = REGISTRY.register("bismuth", () -> new BismuthItem());
	public static final RegistryObject<Item> BORGIUM_DUST = REGISTRY.register("borgium_dust", () -> new BorgiumDustItem());
	public static final RegistryObject<Item> MAGMA_INGOT = REGISTRY.register("magma_ingot", () -> new MagmaIngotItem());
	public static final RegistryObject<Item> BISMUTH_ORE = block(RandomAdditionsModBlocks.BISMUTH_ORE,
			RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> BISMUTH_BLOCK = block(RandomAdditionsModBlocks.BISMUTH_BLOCK,
			RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> BISMUTH_TOOLS_PICKAXE = REGISTRY.register("bismuth_tools_pickaxe", () -> new Bismuth_toolsPickaxeItem());
	public static final RegistryObject<Item> BISMUTH_TOOLS_AXE = REGISTRY.register("bismuth_tools_axe", () -> new Bismuth_toolsAxeItem());
	public static final RegistryObject<Item> BISMUTH_TOOLS_SHOVEL = REGISTRY.register("bismuth_tools_shovel", () -> new Bismuth_toolsShovelItem());
	public static final RegistryObject<Item> BISMUTH_TOOLS_HOE = REGISTRY.register("bismuth_tools_hoe", () -> new Bismuth_toolsHoeItem());
	public static final RegistryObject<Item> BORGIUM_PICKAXE = REGISTRY.register("borgium_pickaxe", () -> new BorgiumPickaxeItem());
	public static final RegistryObject<Item> BORGIUM_AXE = REGISTRY.register("borgium_axe", () -> new BorgiumAxeItem());
	public static final RegistryObject<Item> BORGIUM_SHOVEL = REGISTRY.register("borgium_shovel", () -> new BorgiumShovelItem());
	public static final RegistryObject<Item> BORGIUM_HOE = REGISTRY.register("borgium_hoe", () -> new BorgiumHoeItem());
	public static final RegistryObject<Item> SAW = REGISTRY.register("saw", () -> new SawItem());
	public static final RegistryObject<Item> CHAINSAW = REGISTRY.register("chainsaw", () -> new ChainsawItem());
	public static final RegistryObject<Item> CORK = block(RandomAdditionsModBlocks.CORK, RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> MAGMANIUM_ORE = block(RandomAdditionsModBlocks.MAGMANIUM_ORE,
			RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> MAGMA_BLOCK = block(RandomAdditionsModBlocks.MAGMA_BLOCK,
			RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> BORGIUM_ORE = block(RandomAdditionsModBlocks.BORGIUM_ORE,
			RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> BORGIUM_BLOCK = block(RandomAdditionsModBlocks.BORGIUM_BLOCK,
			RandomAdditionsModTabs.TAB_RANDOMADDITIONS_ITEMS);
	public static final RegistryObject<Item> BISMUTH_TOOLS_SWORD = REGISTRY.register("bismuth_tools_sword", () -> new Bismuth_toolsSwordItem());
	public static final RegistryObject<Item> BORGIUM_SWORD = REGISTRY.register("borgium_sword", () -> new BorgiumSwordItem());
	public static final RegistryObject<Item> GUN = REGISTRY.register("gun", () -> new GunItem());
	public static final RegistryObject<Item> GRENADE = REGISTRY.register("grenade", () -> new GrenadeItem());
	public static final RegistryObject<Item> WOOD_ARMOR_ARMOR_HELMET = REGISTRY.register("wood_armor_armor_helmet",
			() -> new Wood_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> WOOD_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("wood_armor_armor_chestplate",
			() -> new Wood_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> WOOD_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("wood_armor_armor_leggings",
			() -> new Wood_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> WOOD_ARMOR_ARMOR_BOOTS = REGISTRY.register("wood_armor_armor_boots",
			() -> new Wood_ArmorArmorItem.Boots());
	public static final RegistryObject<Item> BORGIUM_ARMOR_HELMET = REGISTRY.register("borgium_armor_helmet", () -> new BorgiumArmorItem.Helmet());
	public static final RegistryObject<Item> BORGIUM_ARMOR_CHESTPLATE = REGISTRY.register("borgium_armor_chestplate",
			() -> new BorgiumArmorItem.Chestplate());
	public static final RegistryObject<Item> BORGIUM_ARMOR_LEGGINGS = REGISTRY.register("borgium_armor_leggings",
			() -> new BorgiumArmorItem.Leggings());
	public static final RegistryObject<Item> BORGIUM_ARMOR_BOOTS = REGISTRY.register("borgium_armor_boots", () -> new BorgiumArmorItem.Boots());
	public static final RegistryObject<Item> BARK = REGISTRY.register("bark", () -> new BarkItem());
	public static final RegistryObject<Item> BULLETS = REGISTRY.register("bullets", () -> new BulletsItem());
	public static final RegistryObject<Item> GRENADETHROWNITEM = REGISTRY.register("grenadethrownitem", () -> new GrenadethrownitemItem());
	public static final RegistryObject<Item> DRILLBIT = REGISTRY.register("drillbit", () -> new DrillbitItem());
	public static final RegistryObject<Item> HEART = REGISTRY.register("heart", () -> new HeartItem());
	public static final RegistryObject<Item> ENCHANTEDBORGOR = REGISTRY.register("enchantedborgor", () -> new EnchantedborgorItem());
	public static final RegistryObject<Item> BUG_DRINK = REGISTRY.register("bug_drink", () -> new BugDrinkItem());
	public static final RegistryObject<Item> TECHNOS_CROWN = REGISTRY.register("technos_crown", () -> new TechnosCrownItem());
	public static final RegistryObject<Item> INFECTED_GRASS = block(RandomAdditionsModBlocks.INFECTED_GRASS,
			RandomAdditionsModTabs.TAB_RANDOM_ADDITIONSBLOCKS);
	public static final RegistryObject<Item> INFECTED_SOIL = block(RandomAdditionsModBlocks.INFECTED_SOIL,
			RandomAdditionsModTabs.TAB_DELETED_MOD_ELEMENT);
	public static final RegistryObject<Item> SHOTGUN = REGISTRY.register("shotgun", () -> new ShotgunItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
