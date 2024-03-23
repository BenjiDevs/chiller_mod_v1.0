
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.chillermod.ChillerModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
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
				tabData.accept(ChillerModModItems.GRINDED_WEED.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ChillerModModItems.SNOOP_SPAWN_EGG.get());
		}
	}
}
