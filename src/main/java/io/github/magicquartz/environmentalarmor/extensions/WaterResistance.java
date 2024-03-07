package io.github.magicquartz.environmentalarmor.extensions;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class WaterResistance extends StatusEffect {
    public WaterResistance() {
        super(StatusEffectCategory.BENEFICIAL, 0x00BBFF);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
