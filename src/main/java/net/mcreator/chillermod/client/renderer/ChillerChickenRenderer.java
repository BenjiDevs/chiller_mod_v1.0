
package net.mcreator.chillermod.client.renderer;

public class ChillerChickenRenderer extends MobRenderer<ChillerChickenEntity, ChickenModel<ChillerChickenEntity>> {

	public ChillerChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ChillerChickenEntity entity) {
		return new ResourceLocation("chiller_mod:textures/entities/chiller_chicken.png");
	}

}
