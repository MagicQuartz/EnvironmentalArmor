package io.github.magicquartz.environmentalarmor.extensions;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class SunResistance extends StatusEffect {
    public SunResistance() {
        super(StatusEffectType.BENEFICIAL, 0xFFE659);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
