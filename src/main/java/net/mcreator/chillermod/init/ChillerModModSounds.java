
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChillerModMod.MODID);
	public static final RegistryObject<SoundEvent> JAKEMAN_VACATION = REGISTRY.register("jakeman_vacation", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chiller_mod", "jakeman_vacation")));
	public static final RegistryObject<SoundEvent> AK_SHOT_SOUND = REGISTRY.register("ak_shot_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("chiller_mod", "ak_shot_sound")));
}
