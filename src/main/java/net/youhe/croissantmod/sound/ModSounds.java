package net.youhe.croissantmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.youhe.croissantmod.CroissantMod;

public class ModSounds {

    public static SoundEvent CROISSANT_DISC = registerSoundEvent("croissant_disc");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(CroissantMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT,id,SoundEvent.of(id));
    }
}
