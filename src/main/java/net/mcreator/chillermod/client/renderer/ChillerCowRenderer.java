
package net.mcreator.chillermod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.chillermod.entity.ChillerCowEntity;

public class ChillerCowRenderer extends MobRenderer<ChillerCowEntity, CowModel<ChillerCowEntity>> {
	public ChillerCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChillerCowEntity entity) {
		return new ResourceLocation("chiller_mod:textures/entities/chillercow.png");
	}
}
