
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RandomAdditionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RandomAdditionsModEntities.GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RandomAdditionsModEntities.GRENADE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RandomAdditionsModEntities.SHOTGUN.get(), ThrownItemRenderer::new);
	}
}
