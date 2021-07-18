package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.extensions.SunResistance;
import io.github.magicquartz.environmentalarmor.extensions.WaterResistance;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;

public class ModEffects {

    public static final StatusEffect WATER_RESISTANCE = new WaterResistance();
    public static final Potion WATER_RESISTANCE_POTION_SHORT = new Potion("water_resistance_short", new StatusEffectInstance(WATER_RESISTANCE, 3600, 0));
    public static final Potion WATER_RESISTANCE_POTION_LONG = new Potion("water_resistance_long", new StatusEffectInstance(WATER_RESISTANCE, 9600, 0));

    public static final StatusEffect SUNSCREEN = new SunResistance();

    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, Main.identifier("water_resistance"), WATER_RESISTANCE);
        Registry.register(Registry.POTION, Main.identifier("water_resist_potion_short"), WATER_RESISTANCE_POTION_SHORT);
        Registry.register(Registry.POTION, Main.identifier("water_resist_potion_long"), WATER_RESISTANCE_POTION_LONG);
        Registry.register(Registry.STATUS_EFFECT, Main.identifier("sunscreen"), SUNSCREEN);
    }
}
