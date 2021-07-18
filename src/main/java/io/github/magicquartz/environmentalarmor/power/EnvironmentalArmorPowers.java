package io.github.magicquartz.environmentalarmor.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeReference;
import io.github.apace100.origins.Origins;
import net.minecraft.util.Identifier;

public class EnvironmentalArmorPowers {

    public static final PowerType<Power> WATER_DAMAGE = new PowerTypeReference<>(new Identifier(Origins.MODID, "water_vulnerability"));
    public static final PowerType<Power> STINGER = new PowerTypeReference<>(new Identifier("moborigins", "stinger"));
}
