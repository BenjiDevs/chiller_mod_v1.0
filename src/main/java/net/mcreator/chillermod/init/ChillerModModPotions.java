
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ChillerModMod.MODID);
	public static final RegistryObject<Potion> JOINT = REGISTRY.register("joint",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 3600, 2, false, true), new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 5, false, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 1, false, true),
					new MobEffectInstance(MobEffects.REGENERATION, 3600, 3, false, true), new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 2, false, true), new MobEffectInstance(MobEffects.JUMP, 3600, 4, false, true)));
}
