package net.fabricmc.croissant.item;

import net.fabricmc.croissant.CroissantMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CroissantMod.MOD_ID, name), item);
    }
    public static final Item CROISSANT = registerItem("croissant", new Item(new FabricItemSettings().food(ModFoodConponents.CROISSANT)));
    public static final Item TESTFUEL = registerItem("testfuel", new Item(new FabricItemSettings()));
    public static void registerModItems() {
        CroissantMod.LOGGER.info("Registering Mod Items");
    }

    public class CROISSANT extends Item {

        public CROISSANT(Settings settings) {
            super(settings);
        }
    }
    /*
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, cuasong1);
    }
    private static void addToItemGroup(ItemGroup group , Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering Mod Items for" + ExampleMod.MOD_ID);


        addItemsToItemGroup();
    }

     */
}
