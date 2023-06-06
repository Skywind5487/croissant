package net.youhe.croissantmod.registries;


import net.youhe.croissantmod.CroissantMod;
import net.youhe.croissantmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;


public class ModRegistries {

    public static void registerModFuel(){
        CroissantMod.LOGGER.info("Registering Mod Items");
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.OVERCOOKED_CROISSANT, 600);

    }
}
