
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cookieg.cookiegrpstuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.cookieg.cookiegrpstuff.client.model.Modelbullet_proof_vest_light_Converted;
import net.cookieg.cookiegrpstuff.client.model.Modelbomb_vest_A;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CookiegRpStuffModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbullet_proof_vest_light_Converted.LAYER_LOCATION, Modelbullet_proof_vest_light_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelbomb_vest_A.LAYER_LOCATION, Modelbomb_vest_A::createBodyLayer);
	}
}
