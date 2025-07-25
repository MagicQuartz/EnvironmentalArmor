package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.extensions.SunResistance;
import io.github.magicquartz.environmentalarmor.extensions.WaterResistance;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> WATER_RESISTANCE;
    public static final RegistryEntry<Potion> WATER_RESISTANCE_POTION_SHORT;
    public static final RegistryEntry<Potion> WATER_RESISTANCE_POTION_LONG;

    public static final RegistryEntry<StatusEffect> SUNSCREEN;

    static {
        WATER_RESISTANCE = Registry.registerReference(Registries.STATUS_EFFECT, Main.identifier("water_resistance"), new WaterResistance());
        WATER_RESISTANCE_POTION_SHORT = Registry.registerReference(Registries.POTION, Main.identifier("water_resist_potion_short"), new Potion("water_resistance_short", new StatusEffectInstance(WATER_RESISTANCE, 3600, 0)));
        WATER_RESISTANCE_POTION_LONG = Registry.registerReference(Registries.POTION, Main.identifier("water_resist_potion_long"), new Potion("water_resistance_long", new StatusEffectInstance(WATER_RESISTANCE, 9600, 0)));
        SUNSCREEN = Registry.registerReference(Registries.STATUS_EFFECT, Main.identifier("sunscreen"), new SunResistance());
    }
}
