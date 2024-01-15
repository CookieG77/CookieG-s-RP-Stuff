
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cookieg.cookiegrpstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.cookieg.cookiegrpstuff.CookiegRpStuffMod;

public class CookiegRpStuffModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CookiegRpStuffMod.MODID);
	public static final RegistryObject<SoundEvent> NOKIASOUND = REGISTRY.register("nokiasound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cookieg_rp_stuff", "nokiasound")));
}
