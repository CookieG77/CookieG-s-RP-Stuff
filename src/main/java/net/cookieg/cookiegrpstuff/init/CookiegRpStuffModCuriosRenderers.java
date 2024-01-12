package net.cookieg.cookiegrpstuff.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.cookieg.cookiegrpstuff.client.renderer.BulletProofVestLightRenderer;
import net.cookieg.cookiegrpstuff.client.renderer.BombVestARenderer;
import net.cookieg.cookiegrpstuff.client.model.Modelbullet_proof_vest_light_Converted;
import net.cookieg.cookiegrpstuff.client.model.Modelbomb_vest_A;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CookiegRpStuffModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(CookiegRpStuffModLayerDefinitions.BOMB_VEST_A, Modelbomb_vest_A::createBodyLayer);
		evt.registerLayerDefinition(CookiegRpStuffModLayerDefinitions.BULLET_PROOF_VEST_LIGHT, Modelbullet_proof_vest_light_Converted::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(CookiegRpStuffModItems.BOMB_VEST_A.get(), BombVestARenderer::new);
		CuriosRendererRegistry.register(CookiegRpStuffModItems.BULLET_PROOF_VEST_LIGHT.get(), BulletProofVestLightRenderer::new);
	}
}
