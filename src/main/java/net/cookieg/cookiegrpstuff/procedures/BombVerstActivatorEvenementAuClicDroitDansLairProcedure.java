package net.cookieg.cookiegrpstuff.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.cookieg.cookiegrpstuff.init.CookiegRpStuffModItems;
import net.cookieg.cookiegrpstuff.CookiegRpStuffMod;

import java.util.ArrayList;

public class BombVerstActivatorEvenementAuClicDroitDansLairProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(CookiegRpStuffModItems.BOMB_VEST_ACTIVATOR.get(), 60);
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(CookiegRpStuffModItems.BOMB_VEST_A.get(), lv).isPresent() : false) {
				if (entityiterator instanceof LivingEntity lv) {
					CuriosApi.getCuriosHelper().findCurios(lv, CookiegRpStuffModItems.BOMB_VEST_A.get()).forEach(item -> {
						ItemStack itemstackiterator = item.stack();
						if ((entity.getDisplayName().getString()).equals(itemstackiterator.getOrCreateTag().getString("BombPlanter"))) {
							if (entity instanceof Player _player)
								_player.getCooldowns().addCooldown(CookiegRpStuffModItems.BOMB_VEST_ACTIVATOR.get(), 300);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cookieg_rp_stuff:nokiasound")),
											SoundSource.PLAYERS, 3, 1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cookieg_rp_stuff:nokiasound")), SoundSource.PLAYERS, 3,
											1, false);
								}
							}
							CookiegRpStuffMod.queueServerWork(60, () -> {
								itemstackiterator.shrink(1);
								if (entityiterator instanceof LivingEntity _entity)
									_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
										@Override
										public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
											String _translatekey = "death.attack." + "bomb";
											if (this.getEntity() == null && this.getDirectEntity() == null) {
												return _msgEntity.getKillCredit() != null
														? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
														: Component.translatable(_translatekey, _msgEntity.getDisplayName());
											} else {
												Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
												ItemStack _itemstack = ItemStack.EMPTY;
												if (this.getEntity() instanceof LivingEntity _livingentity)
													_itemstack = _livingentity.getMainHandItem();
												return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
														? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
														: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
											}
										}
									}, 100);
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 6, Level.ExplosionInteraction.TNT);
							});
						}
					});
				}
			}
		}
	}
}
