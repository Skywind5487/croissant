package net.youhe.croissantmod.registries.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> CROISSANTS =
            TagKey.of(RegistryKeys.ITEM, new Identifier("croissantmod","croissants"));

}
