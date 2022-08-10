
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomAdditionsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("random_additions", "ultimatum"), new SoundEvent(new ResourceLocation("random_additions", "ultimatum")));
		REGISTRY.put(new ResourceLocation("random_additions", "scpsltrackbutdiffrent"),
				new SoundEvent(new ResourceLocation("random_additions", "scpsltrackbutdiffrent")));
		REGISTRY.put(new ResourceLocation("random_additions", "lucidremix"), new SoundEvent(new ResourceLocation("random_additions", "lucidremix")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
