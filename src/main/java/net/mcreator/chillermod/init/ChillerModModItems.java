
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chillermod.item.StonerSwordItem;
import net.mcreator.chillermod.item.MarijuanleafItem;
import net.mcreator.chillermod.item.JakemanVacationDiskItem;
import net.mcreator.chillermod.item.BlackGlassStickItem;
import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChillerModMod.MODID);
	public static final RegistryObject<Item> STONER_SWORD = REGISTRY.register("stoner_sword", () -> new StonerSwordItem());
	public static final RegistryObject<Item> MARIJUANLEAF = REGISTRY.register("marijuanleaf", () -> new MarijuanleafItem());
	public static final RegistryObject<Item> BLACK_GLASS_STICK = REGISTRY.register("black_glass_stick", () -> new BlackGlassStickItem());
	public static final RegistryObject<Item> WEED_BALE = block(ChillerModModBlocks.WEED_BALE);
	public static final RegistryObject<Item> JAKEMAN_VACATION_DISK = REGISTRY.register("jakeman_vacation_disk", () -> new JakemanVacationDiskItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
