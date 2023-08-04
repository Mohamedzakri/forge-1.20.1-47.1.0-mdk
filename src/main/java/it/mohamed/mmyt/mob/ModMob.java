package it.mohamed.mmyt.mob;

import it.mohamed.mmyt.TutorialMod;
import it.mohamed.mmyt.entity.ExampleEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMob {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TutorialMod.MOD_ID);
    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE =
            ENTITIES.register("example_entity",
                    () -> EntityType.Builder.of(ExampleEntity::new , MobCategory.CREATURE).sized(1.0f, 1.0f).build(TutorialMod.MOD_ID + ":example"));
}
