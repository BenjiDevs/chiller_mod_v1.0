
package net.mcreator.chillermod.client.renderer;

public class ChillerCowRenderer extends MobRenderer<ChillerCowEntity, CowModel<ChillerCowEntity>> {

	public ChillerCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ChillerCowEntity entity) {
		return new ResourceLocation("chiller_mod:textures/entities/chillercow.png");
	}

}
