package net.youhe.croissantmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.youhe.croissantmod.CroissantMod;
import net.youhe.croissantmod.sound.ModSounds;

public class ModItems {
    public static final Item CROISSANT = registerItem("croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build())));
    public static final Item LIGHT_SUGAR_CROISSANT = registerItem("light_sugar_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,0),0.5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,0),0.5f).build())));
    public static final Item HALF_SUGAR_CROISSANT = registerItem("half_sugar_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,0),0.8f).build())));
    public static final Item TAINAN_CROISSANT = registerItem("tainan_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,1),0.8f).build())));
    public static final Item LIGHT_SUGAR_CHOCO_CROISSANT = registerItem("light_sugar_choco_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,0),0.5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,0),0.5f).build())));
    public static final Item HALF_SUGAR_CHOCO_CROISSANT = registerItem("half_sugar_choco_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,0),0.8f).build())));
    public static final Item TAINAN_CHOCO_CROISSANT = registerItem("tainan_choco_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,100,1),0.8f).build())));
    public static final Item CHOCO_CROISSANT = registerItem("choco_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build())));
    public static final Item RAW_CHOCO_CROISSANT = registerItem("raw_choco_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build())));
    public static final Item RAW_CROISSANT = registerItem("raw_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(1).snack().build())));
    public static final Item OVERCOOKED_CROISSANT = registerItem("overcooked_croissant",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder().snack()
                            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200,0),1.0f).build())));
    public static final Item CROISSANT_DISC = registerItem("croissant_disc",
            new MusicDiscItem(7, ModSounds.CROISSANT_DISC, new FabricItemSettings().maxCount(1), 16));

    public static void registerModItems() {
        CroissantMod.LOGGER.info("Registering Mod Items");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CroissantMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, LIGHT_SUGAR_CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, HALF_SUGAR_CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, TAINAN_CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CHOCO_CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, LIGHT_SUGAR_CHOCO_CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, HALF_SUGAR_CHOCO_CROISSANT);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, TAINAN_CHOCO_CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_CHOCO_CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, OVERCOOKED_CROISSANT);
        addToItemGroup(ItemGroups.INGREDIENTS, CROISSANT_DISC);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, OVERCOOKED_CROISSANT);

        addToItemGroup(ModItemGroup.LAS_CROISSANTS,CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,RAW_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,LIGHT_SUGAR_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,HALF_SUGAR_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,TAINAN_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,CHOCO_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,RAW_CHOCO_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,LIGHT_SUGAR_CHOCO_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,HALF_SUGAR_CHOCO_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,TAINAN_CHOCO_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,OVERCOOKED_CROISSANT);
        addToItemGroup(ModItemGroup.LAS_CROISSANTS,CROISSANT_DISC);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    /*public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }*/
}
