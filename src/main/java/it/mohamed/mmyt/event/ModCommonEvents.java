package it.mohamed.mmyt.event;

import it.mohamed.mmyt.TutorialMod;
import it.mohamed.mmyt.entity.ExampleEntity;
import it.mohamed.mmyt.mob.ModMob;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCommonEvents
{
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModMob.EXAMPLE.get(), ExampleEntity.getExampleAttribute().build());
    }
}