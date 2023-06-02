package net.youhe.croissantmod;

import net.fabricmc.api.ModInitializer;

import net.youhe.croissantmod.item.ModItemGroup;
import net.youhe.croissantmod.item.ModItems;
import net.youhe.croissantmod.registries.ModRegistries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CroissantMod implements ModInitializer {
    public static final String MOD_ID = "croissantmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("croissantmod");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModItems.addItemsToItemGroup();
        ModRegistries.registerModFuel();
    }
}