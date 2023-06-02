package net.youhe.croissantmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.youhe.croissantmod.CroissantMod;

public class ModItemGroup {
    public static ItemGroup LAS_CROISSANTS;

    public static void registerItemGroups(){
        LAS_CROISSANTS = FabricItemGroup.builder(new Identifier(CroissantMod.MOD_ID, "las_croissants"))
                .displayName(Text.literal("las Croissants"))
                .icon(() -> new ItemStack(ModItems.CROISSANT)).build();
    }


}
