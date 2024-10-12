package com.discs.music.sound;

import com.discs.music.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Music.MODID);

    public static final RegistryObject<SoundEvent> RAMBLE_ON =
            registerSoundEvent("ramble_on");

    public static final RegistryObject<SoundEvent> REAL_GONE =
            registerSoundEvent("real_gone");

    public static final RegistryObject<SoundEvent> OWNER_OF_A_LONELY_HEART =
            registerSoundEvent("owner_of_a_lonely_heart");

    public static final RegistryObject<SoundEvent> OVNI =
            registerSoundEvent("ovni");

    public static final RegistryObject<SoundEvent> ABOUT_LOVE =
            registerSoundEvent("about_love");

    public static final RegistryObject<SoundEvent> RICK_ROLL =
            registerSoundEvent("rick_roll");

    public static final RegistryObject<SoundEvent> VOODOO_CHILD =
            registerSoundEvent("voodoo_child");

    public static final RegistryObject<SoundEvent> LIUYING =
            registerSoundEvent("liuying");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(Music.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENT.register(eventBus);
    }
}
