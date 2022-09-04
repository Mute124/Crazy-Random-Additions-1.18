
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.randomadditions.fluid.HotfuckingwaterFluid;
import net.mcreator.randomadditions.RandomAdditionsMod;

public class RandomAdditionsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, RandomAdditionsMod.MODID);
	public static final RegistryObject<Fluid> HOTFUCKINGWATER = REGISTRY.register("hotfuckingwater", () -> new HotfuckingwaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_HOTFUCKINGWATER = REGISTRY.register("flowing_hotfuckingwater",
			() -> new HotfuckingwaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HOTFUCKINGWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HOTFUCKINGWATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
