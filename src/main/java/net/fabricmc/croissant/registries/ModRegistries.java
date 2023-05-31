package net.fabricmc.croissant.registries;

import net.fabricmc.croissant.CroissantMod;
import net.fabricmc.croissant.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModRegistries {

    public static void registerModFuel(){
        CroissantMod.LOGGER.info("Registering Mod Items");
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.TESTFUEL, 300);

    }
    public static void registerGiftLootTable(){
        CroissantMod.LOGGER.info("Registering Mod Items");
        //Registry registry -

    }
}
