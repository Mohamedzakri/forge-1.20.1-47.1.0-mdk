package it.mohamed.mmyt.block;

import it.mohamed.mmyt.TutorialMod;
import it.mohamed.mmyt.item.ModItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    //creates the block
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANVIL)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerObjectItem(name, toReturn);
    return toReturn;
    }
    //the issue is that the block isn't associated with any item. the next method helps with registers the block manually
    private static <T extends  Block> RegistryObject<Item> registerObjectItem(String name, RegistryObject<T> block){
     return ModItem.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
