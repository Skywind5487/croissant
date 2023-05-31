package net.youhe.croissantmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.youhe.croissantmod.CroissantMod;
import net.youhe.croissantmod.sound.ModSounds;

public class ModItems {
    public static final Item CROISSANT = registerItem("croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build())));
    public static final Item RAW_CROISSANT = registerItem("raw_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(1).build())));
    public static final Item OVERCOOKED_CROISSANT = registerItem("overcooked_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().build())));
    public static final Item DISC = registerItem("disc",
            new MusicDiscItem(7, ModSounds.CROISSANT, new FabricItemSettings().maxCount(1), 16));

    public static void registerModItems() {
        CroissantMod.LOGGER.info("Registering Mod Items");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CroissantMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, OVERCOOKED_CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, DISC);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

}
