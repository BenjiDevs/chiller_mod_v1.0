
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChillerModMod.MODID);
	public static final RegistryObject<CreativeModeTab> WEED = REGISTRY.register("weed",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chiller_mod.weed")).icon(() -> new ItemStack(ChillerModModItems.MARIJUANLEAF.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ChillerModModItems.STONER_SWORD.get());
				tabData.accept(ChillerModModItems.MARIJUANLEAF.get());
				tabData.accept(ChillerModModItems.BLACK_GLASS_STICK.get());
				tabData.accept(ChillerModModBlocks.WEED_BALE.get().asItem());
				tabData.accept(ChillerModModItems.JAKEMAN_VACATION_DISK.get());
				tabData.accept(ChillerModModBlocks.BONGTEST.get().asItem());
				tabData.accept(ChillerModModItems.VAPETEST.get());
			}).withSearchBar().build());
}
