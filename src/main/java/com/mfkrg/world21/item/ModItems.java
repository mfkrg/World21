package com.mfkrg.world21.item;

import com.mfkrg.world21.World21Mod;
import com.mfkrg.world21.item.custom.DungeonFinderItem;
import com.mfkrg.world21.item.custom.MythrilStaff;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, World21Mod.MOD_ID);


    //ingots n metal pieces

    public static  final RegistryObject<Item> BLOOD_INGOT = ITEMS.register("blood_ingot", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB)));
    public static  final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB)));
    public static  final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB)));
    public static  final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB)));
    public static  final RegistryObject<Item> RAW_MYTHRIL = ITEMS.register("raw_mythril", () -> new Item(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB)));




    //custom items

    public static  final RegistryObject<Item> DUNGEON_FINDER_ITEM = ITEMS.register("dungeon_finder_item", () -> new DungeonFinderItem(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB).durability(32)));
    public static  final RegistryObject<Item> MYTHRIL_STAFF = ITEMS.register("mythril_staff", () -> new MythrilStaff(new Item.Properties()
            .tab(ModCreativeModeTab.WORLD21_TAB).durability(64)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
