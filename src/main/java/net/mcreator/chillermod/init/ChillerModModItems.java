
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chillermod.item.VapetestItem;
import net.mcreator.chillermod.item.StonerSwordItem;
import net.mcreator.chillermod.item.MarijuanleafItem;
import net.mcreator.chillermod.item.KeefItem;
import net.mcreator.chillermod.item.JakemanVacationDiskItem;
import net.mcreator.chillermod.item.GunItem;
import net.mcreator.chillermod.item.GrinderSpikeItem;
import net.mcreator.chillermod.item.GrindedWeedItem;
import net.mcreator.chillermod.item.BlooBerryVapeItem;
import net.mcreator.chillermod.item.BlackGlassStickItem;
import net.mcreator.chillermod.item.AkFireSerpentItem;
import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChillerModMod.MODID);
	public static final RegistryObject<Item> STONER_SWORD = REGISTRY.register("stoner_sword", () -> new StonerSwordItem());
	public static final RegistryObject<Item> MARIJUANLEAF = REGISTRY.register("marijuanleaf", () -> new MarijuanleafItem());
	public static final RegistryObject<Item> BLACK_GLASS_STICK = REGISTRY.register("black_glass_stick", () -> new BlackGlassStickItem());
	public static final RegistryObject<Item> WEED_BALE = block(ChillerModModBlocks.WEED_BALE);
	public static final RegistryObject<Item> JAKEMAN_VACATION_DISK = REGISTRY.register("jakeman_vacation_disk", () -> new JakemanVacationDiskItem());
	public static final RegistryObject<Item> BONGTEST = block(ChillerModModBlocks.BONGTEST);
	public static final RegistryObject<Item> VAPETEST = REGISTRY.register("vapetest", () -> new VapetestItem());
	public static final RegistryObject<Item> SNOOP_SPAWN_EGG = REGISTRY.register("snoop_spawn_egg", () -> new ForgeSpawnEggItem(ChillerModModEntities.SNOOP, -11193088, -15220992, new Item.Properties()));
	public static final RegistryObject<Item> GRINDED_WEED = REGISTRY.register("grinded_weed", () -> new GrindedWeedItem());
	public static final RegistryObject<Item> KEEF = REGISTRY.register("keef", () -> new KeefItem());
	public static final RegistryObject<Item> WATER_BONG = block(ChillerModModBlocks.WATER_BONG);
	public static final RegistryObject<Item> GRINDER_BLOCK = block(ChillerModModBlocks.GRINDER_BLOCK);
	public static final RegistryObject<Item> WATER_BONG_WIT_GRASS = block(ChillerModModBlocks.WATER_BONG_WIT_GRASS);
	public static final RegistryObject<Item> GRINDER_SPIKE = REGISTRY.register("grinder_spike", () -> new GrinderSpikeItem());
	public static final RegistryObject<Item> CHILLER_COW_SPAWN_EGG = REGISTRY.register("chiller_cow_spawn_egg", () -> new ForgeSpawnEggItem(ChillerModModEntities.CHILLER_COW, -16711936, -16751053, new Item.Properties()));
	public static final RegistryObject<Item> COUCH = block(ChillerModModBlocks.COUCH);
	public static final RegistryObject<Item> CHILLER_CHICKEN_SPAWN_EGG = REGISTRY.register("chiller_chicken_spawn_egg", () -> new ForgeSpawnEggItem(ChillerModModEntities.CHILLER_CHICKEN, -16738048, -256, new Item.Properties()));
	public static final RegistryObject<Item> WEED_WOOD_LOG = block(ChillerModModBlocks.WEED_WOOD_LOG);
	public static final RegistryObject<Item> WEED_WOOD_LEAVES = block(ChillerModModBlocks.WEED_WOOD_LEAVES);
	public static final RegistryObject<Item> THREEDGRINDER = block(ChillerModModBlocks.THREEDGRINDER);
	public static final RegistryObject<Item> WEED_WOOD_PLANK = block(ChillerModModBlocks.WEED_WOOD_PLANK);
	public static final RegistryObject<Item> WEED_WOOD_PLANKS = block(ChillerModModBlocks.WEED_WOOD_PLANKS);
	public static final RegistryObject<Item> GUN = REGISTRY.register("gun", () -> new GunItem());
	public static final RegistryObject<Item> AK_FIRE_SERPENT = REGISTRY.register("ak_fire_serpent", () -> new AkFireSerpentItem());
	public static final RegistryObject<Item> BLOO_BERRY_VAPE = REGISTRY.register("bloo_berry_vape", () -> new BlooBerryVapeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
