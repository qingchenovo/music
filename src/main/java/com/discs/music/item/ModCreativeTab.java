package com.discs.music.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab DISC_TAB = new CreativeModeTab("disc_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAMBLE_ON_DISC.get());
        }
    };
}
