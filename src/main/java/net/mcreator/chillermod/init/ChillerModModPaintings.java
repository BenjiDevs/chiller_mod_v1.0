
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ChillerModMod.MODID);
	public static final RegistryObject<PaintingVariant> WEED_PAINTING_1 = REGISTRY.register("weed_painting_1", () -> new PaintingVariant(16, 32));
}
