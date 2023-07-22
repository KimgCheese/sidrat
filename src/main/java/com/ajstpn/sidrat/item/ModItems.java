package com.ajstpn.sidrat.item;

import com.ajstpn.sidrat.util.ModSoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import com.ajstpn.sidrat.Sidrat;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Sidrat.MOD_ID);


    public static final RegistryObject<Item> REINFORCERMODULE = ITEMS.register("reinforcermodule",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> CLOISTERMODULE = ITEMS.register("cloistermodule",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> VORTEXMODULE = ITEMS.register("vortexmodule",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> ARTRON_INGOT = ITEMS.register("artron_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> ARTRON_DUST = ITEMS.register("artron_dust",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> XION_DUST = ITEMS.register("xion_dust",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> GAIA_DUST = ITEMS.register("gaia_dust",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));
    public static final RegistryObject<Item> TARDISCORE = ITEMS.register("tardiscore",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> TARDIS_ESSENCE = ITEMS.register("tardis_essence",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> ARTRONENERGYMODULE = ITEMS.register("artronenergymodule",
            () -> new Item(new Item.Properties().group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> TEN_DOCTOR_THEME_DISC = ITEMS.register("ten_doctor_theme_disc",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.TEN_DOCTOR_THEME.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> AUSTRALIA_SONG_DISC = ITEMS.register("australia_song_disc",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.AUSTRALIA_DEAD_ANIMALS.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.SIDRAT_GROUP)));

    public static final RegistryObject<Item> I_AM_THE_DOCTOR_DISC = ITEMS.register("i_am_the_doctor_disc",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.I_AM_THE_DOCTOR.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroup.SIDRAT_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
