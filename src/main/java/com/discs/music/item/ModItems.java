package com.discs.music.item;

import com.discs.music.Music;
import com.discs.music.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

    public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, Music.MODID);

        private static final Item.Properties discProperties =
                new Item.Properties().stacksTo(1).tab(ModCreativeTab.DISC_TAB);

        public static final RegistryObject<Item> RAMBLE_ON_DISC = ITEMS.register("ramble_on_disc",
                () -> new RecordItem(10, ModSounds.RAMBLE_ON, discProperties,1));

        public static final RegistryObject<Item> REAL_GONE_DISC = ITEMS.register("real_gone_disc",
                () -> new RecordItem(10, ModSounds.REAL_GONE, discProperties,1));

        public static final RegistryObject<Item> OWNER_OF_A_LONELY_HEART_DISC = ITEMS.register("owner_of_a_lonely_heart_disc",
                () -> new RecordItem(10, ModSounds.OWNER_OF_A_LONELY_HEART, discProperties,1));

        public static final RegistryObject<Item> OVNI_DISC = ITEMS.register("ovni_disc",
                () -> new RecordItem(10, ModSounds.OVNI, discProperties,1));

        public static final RegistryObject<Item> ABOUT_LOVE_DISC = ITEMS.register("about_love_disc",
                () -> new RecordItem(10, ModSounds.ABOUT_LOVE, discProperties,1));

        public static final RegistryObject<Item> RICK_ROLL_DISC = ITEMS.register("rick_roll_disc",
                () -> new RecordItem(10, ModSounds.RICK_ROLL, discProperties,1));

        public static final RegistryObject<Item> VOODOO_CHILD_DISC = ITEMS.register("voodoo_child_disc",
                () -> new RecordItem(10, ModSounds.VOODOO_CHILD, discProperties,1));

        public static final RegistryObject<Item> LIUYING = ITEMS.register("liuying_disc",
                () -> new RecordItem(10, ModSounds.LIUYING, discProperties,1));

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }

