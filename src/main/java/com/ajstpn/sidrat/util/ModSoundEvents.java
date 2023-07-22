package com.ajstpn.sidrat.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.ajstpn.sidrat.Sidrat;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Sidrat.MOD_ID);

    public static final RegistryObject<SoundEvent> TEN_DOCTOR_THEME =
            registerSoundEvent("ten_doctor_theme");

    public static final RegistryObject<SoundEvent> AUSTRALIA_DEAD_ANIMALS =
            registerSoundEvent("australia_deadliest_animals");

    public static final RegistryObject<SoundEvent> I_AM_THE_DOCTOR =
            registerSoundEvent("i_am_the_doctor");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Sidrat.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}