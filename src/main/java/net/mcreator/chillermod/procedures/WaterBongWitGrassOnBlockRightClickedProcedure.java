package net.mcreator.chillermod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WaterBongWitGrassOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChillerModModItems.LIGHTER.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ChillerModModBlocks.WATER_BONG_WIT_GRASS.get()) {
				ChillerModMod.queueServerWork(2, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, 25, 0, 2, 0, 0.4);
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("chiller_mod:first_high"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 3600, 1));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 5));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 3600, 1));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3600, 3));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 2));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 3600, 4));
				});
			}
		}
	}
}
