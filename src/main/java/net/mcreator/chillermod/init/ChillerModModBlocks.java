
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chillermod.block.WeedBaleBlock;
import net.mcreator.chillermod.block.WaterBongBlock;
import net.mcreator.chillermod.block.BongtestBlock;
import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChillerModMod.MODID);
	public static final RegistryObject<Block> WEED_BALE = REGISTRY.register("weed_bale", () -> new WeedBaleBlock());
	public static final RegistryObject<Block> BONGTEST = REGISTRY.register("bongtest", () -> new BongtestBlock());
	public static final RegistryObject<Block> WATER_BONG = REGISTRY.register("water_bong", () -> new WaterBongBlock());
}
