
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chillermod.block.WeedWoodLogBlock;
import net.mcreator.chillermod.block.WeedWoodLeavesBlock;
import net.mcreator.chillermod.block.WeedBaleBlock;
import net.mcreator.chillermod.block.WaterBongWitGrassBlock;
import net.mcreator.chillermod.block.WaterBongBlock;
import net.mcreator.chillermod.block.GrinderBlockBlock;
import net.mcreator.chillermod.block.CouchBlock;
import net.mcreator.chillermod.block.BongtestBlock;
import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChillerModMod.MODID);
	public static final RegistryObject<Block> WEED_BALE = REGISTRY.register("weed_bale", () -> new WeedBaleBlock());
	public static final RegistryObject<Block> BONGTEST = REGISTRY.register("bongtest", () -> new BongtestBlock());
	public static final RegistryObject<Block> WATER_BONG = REGISTRY.register("water_bong", () -> new WaterBongBlock());
	public static final RegistryObject<Block> GRINDER_BLOCK = REGISTRY.register("grinder_block", () -> new GrinderBlockBlock());
	public static final RegistryObject<Block> WATER_BONG_WIT_GRASS = REGISTRY.register("water_bong_wit_grass", () -> new WaterBongWitGrassBlock());
	public static final RegistryObject<Block> COUCH = REGISTRY.register("couch", () -> new CouchBlock());
	public static final RegistryObject<Block> WEED_WOOD_LOG = REGISTRY.register("weed_wood_log", () -> new WeedWoodLogBlock());
	public static final RegistryObject<Block> WEED_WOOD_LEAVES = REGISTRY.register("weed_wood_leaves", () -> new WeedWoodLeavesBlock());
}
