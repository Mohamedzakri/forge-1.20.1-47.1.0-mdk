package it.mohamed.mmyt.client.renderer;

import it.mohamed.mmyt.TutorialMod;
import it.mohamed.mmyt.client.models.ExampleEntityModel;
import it.mohamed.mmyt.entity.ExampleEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ExampleEntityRenderer extends MobRenderer<ExampleEntity, ExampleEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(TutorialMod.MOD_ID, "textures/entities/example_texture.png");
    public ExampleEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx,new ExampleEntityModel(ctx.bakeLayer(ExampleEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ExampleEntity entity) {
        return TEXTURE;
    }
}
