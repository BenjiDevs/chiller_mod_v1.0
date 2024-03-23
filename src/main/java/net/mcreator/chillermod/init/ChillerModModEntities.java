
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.chillermod.entity.SnoopEntity;
import net.mcreator.chillermod.entity.ChillerCowEntity;
import net.mcreator.chillermod.entity.ChillerChickenEntity;
import net.mcreator.chillermod.entity.BulletEntity;
import net.mcreator.chillermod.ChillerModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChillerModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChillerModMod.MODID);
	public static final RegistryObject<EntityType<SnoopEntity>> SNOOP = register("snoop",
			EntityType.Builder.<SnoopEntity>of(SnoopEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnoopEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChillerCowEntity>> CHILLER_COW = register("chiller_cow",
			EntityType.Builder.<ChillerCowEntity>of(ChillerCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChillerCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<ChillerChickenEntity>> CHILLER_CHICKEN = register("chiller_chicken",
			EntityType.Builder.<ChillerChickenEntity>of(ChillerChickenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChillerChickenEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<BulletEntity>> BULLET = register("projectile_bullet",
			EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).setCustomClientFactory(BulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SnoopEntity.init();
			ChillerCowEntity.init();
			ChillerChickenEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SNOOP.get(), SnoopEntity.createAttributes().build());
		event.put(CHILLER_COW.get(), ChillerCowEntity.createAttributes().build());
		event.put(CHILLER_CHICKEN.get(), ChillerChickenEntity.createAttributes().build());
	}
}
