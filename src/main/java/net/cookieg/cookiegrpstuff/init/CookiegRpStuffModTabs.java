
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cookieg.cookiegrpstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.cookieg.cookiegrpstuff.CookiegRpStuffMod;

public class CookiegRpStuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CookiegRpStuffMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD_CREATIVE_TAB = REGISTRY.register("mod_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cookieg_rp_stuff.mod_creative_tab")).icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING)).displayItems((parameters, tabData) -> {
				tabData.accept(CookiegRpStuffModItems.BOMB_VEST_A.get());
				tabData.accept(CookiegRpStuffModItems.BULLET_PROOF_VEST_LIGHT.get());
				tabData.accept(CookiegRpStuffModItems.BOMB_VEST_KEY.get());
				tabData.accept(CookiegRpStuffModItems.BOMB_VEST_ACTIVATOR.get());
			})

					.build());
}
