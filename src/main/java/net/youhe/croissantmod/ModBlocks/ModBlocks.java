package net.youhe.croissantmod.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.youhe.croissantmod.CroissantMod;

public class ModBlocks {
    public static void registerModBlocks() {
        CroissantMod.LOGGER.info("Registering Mod Items");
    }
    public static final Block testCCC =registerBlock("ff",new CarvedPumpkinBlock(FabricBlockSettings.of(Material.STONE).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(CroissantMod.MOD_ID, name), block);
    }

    public static void addItemsToItemGroup() {


    }
    public static void addToItemGroup(ItemGroup group, Block block) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
    }
}