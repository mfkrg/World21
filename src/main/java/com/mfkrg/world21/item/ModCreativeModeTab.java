package com.mfkrg.world21.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab WORLD21_TAB = new CreativeModeTab("world_21_mod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYTHRIL_INGOT.get());
        }
    };
}
