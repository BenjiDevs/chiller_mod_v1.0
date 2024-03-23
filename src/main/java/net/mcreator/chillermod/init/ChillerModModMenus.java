
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.chillermod.world.inventory.GrinderGUIMenu;
import net.mcreator.chillermod.ChillerModMod;

public class ChillerModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChillerModMod.MODID);
	public static final RegistryObject<MenuType<GrinderGUIMenu>> GRINDER_GUI = REGISTRY.register("grinder_gui", () -> IForgeMenuType.create(GrinderGUIMenu::new));
}
