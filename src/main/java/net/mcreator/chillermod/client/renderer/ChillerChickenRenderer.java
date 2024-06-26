
package net.mcreator.chillermod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.chillermod.entity.ChillerChickenEntity;

public class ChillerChickenRenderer extends MobRenderer<ChillerChickenEntity, ChickenModel<ChillerChickenEntity>> {
	public ChillerChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChillerChickenEntity entity) {
		return new ResourceLocation("chiller_mod:textures/entities/chiller_chicken.png");
	}
}
