
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chillermod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.chillermod.client.renderer.SnoopRenderer;
import net.mcreator.chillermod.client.renderer.ChillerCowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChillerModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ChillerModModEntities.SNOOP.get(), SnoopRenderer::new);
		event.registerEntityRenderer(ChillerModModEntities.CHILLER_COW.get(), ChillerCowRenderer::new);
	}
}
