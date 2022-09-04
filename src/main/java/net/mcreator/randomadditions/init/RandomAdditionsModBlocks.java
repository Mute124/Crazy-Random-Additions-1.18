
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomadditions.block.UnobtaniousBlock;
import net.mcreator.randomadditions.block.MagmaOreBlock;
import net.mcreator.randomadditions.block.MagmaBlockBlock;
import net.mcreator.randomadditions.block.InfectedSoilBlock;
import net.mcreator.randomadditions.block.InfectedGrassBlock;
import net.mcreator.randomadditions.block.HotfuckingwaterBlock;
import net.mcreator.randomadditions.block.CorkBlock;
import net.mcreator.randomadditions.block.BorgiumOreBlock;
import net.mcreator.randomadditions.block.BorgiumBlockBlock;
import net.mcreator.randomadditions.block.BismuthOreBlock;
import net.mcreator.randomadditions.block.BismuthBlockBlock;
import net.mcreator.randomadditions.RandomAdditionsMod;

public class RandomAdditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomAdditionsMod.MODID);
	public static final RegistryObject<Block> BISMUTH_ORE = REGISTRY.register("bismuth_ore", () -> new BismuthOreBlock());
	public static final RegistryObject<Block> BISMUTH_BLOCK = REGISTRY.register("bismuth_block", () -> new BismuthBlockBlock());
	public static final RegistryObject<Block> CORK = REGISTRY.register("cork", () -> new CorkBlock());
	public static final RegistryObject<Block> MAGMA_ORE = REGISTRY.register("magma_ore", () -> new MagmaOreBlock());
	public static final RegistryObject<Block> MAGMA_BLOCK = REGISTRY.register("magma_block", () -> new MagmaBlockBlock());
	public static final RegistryObject<Block> BORGIUM_ORE = REGISTRY.register("borgium_ore", () -> new BorgiumOreBlock());
	public static final RegistryObject<Block> BORGIUM_BLOCK = REGISTRY.register("borgium_block", () -> new BorgiumBlockBlock());
	public static final RegistryObject<Block> INFECTED_GRASS = REGISTRY.register("infected_grass", () -> new InfectedGrassBlock());
	public static final RegistryObject<Block> INFECTED_SOIL = REGISTRY.register("infected_soil", () -> new InfectedSoilBlock());
	public static final RegistryObject<Block> UNOBTANIOUS = REGISTRY.register("unobtanious", () -> new UnobtaniousBlock());
	public static final RegistryObject<Block> HOTFUCKINGWATER = REGISTRY.register("hotfuckingwater", () -> new HotfuckingwaterBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			UnobtaniousBlock.registerRenderLayer();
		}
	}
}
