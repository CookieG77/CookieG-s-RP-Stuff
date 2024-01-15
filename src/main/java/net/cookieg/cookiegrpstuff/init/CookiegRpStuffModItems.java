
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cookieg.cookiegrpstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.cookieg.cookiegrpstuff.item.BulletProofVestLightItem;
import net.cookieg.cookiegrpstuff.item.BombVestKeyItem;
import net.cookieg.cookiegrpstuff.item.BombVestActivatorItem;
import net.cookieg.cookiegrpstuff.item.BombVestAItem;
import net.cookieg.cookiegrpstuff.CookiegRpStuffMod;

public class CookiegRpStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CookiegRpStuffMod.MODID);
	public static final RegistryObject<Item> BOMB_VEST_A = REGISTRY.register("bomb_vest_a", () -> new BombVestAItem());
	public static final RegistryObject<Item> BULLET_PROOF_VEST_LIGHT = REGISTRY.register("bullet_proof_vest_light", () -> new BulletProofVestLightItem());
	public static final RegistryObject<Item> BOMB_VEST_KEY = REGISTRY.register("bomb_vest_key", () -> new BombVestKeyItem());
	public static final RegistryObject<Item> BOMB_VEST_ACTIVATOR = REGISTRY.register("bomb_vest_activator", () -> new BombVestActivatorItem());
}
