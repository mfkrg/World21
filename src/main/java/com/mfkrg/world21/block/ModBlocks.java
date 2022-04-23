package com.mfkrg.world21.block;

import com.mfkrg.world21.World21Mod;
import com.mfkrg.world21.item.ModCreativeModeTab;
import com.mfkrg.world21.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, World21Mod.MOD_ID);

    public static final RegistryObject<Block> BLOOD_ORE = registerBlock("blood_ore", ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f)
            .requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f)
            .requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MYTHRIL_ORE = registerBlock("mythril_ore", ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f)
            .requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEEPSLATE_BLOOD_ORE = registerBlock("deepslate_blood_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(7f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.WORLD21_TAB);
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(7f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.WORLD21_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(10f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.WORLD21_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
