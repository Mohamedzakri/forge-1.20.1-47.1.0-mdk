package it.mohamed.mmyt.event;

import it.mohamed.mmyt.TutorialMod;
import it.mohamed.mmyt.client.models.ExampleEntityModel;
import it.mohamed.mmyt.client.renderer.ExampleEntityRenderer;
import it.mohamed.mmyt.entity.ExampleEntity;
import it.mohamed.mmyt.mob.ModMob;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ModClientEvents
    {

        @SubscribeEvent
        public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(ModMob.EXAMPLE.get(), ExampleEntityRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
            event.registerLayerDefinition(ExampleEntityModel.LAYER_LOCATION,ExampleEntityModel::createBodyLayer);
        }
    }

