package io.github.magicquartz.environmentalarmor.extensions;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.entry.RegistryEntry;

public class CustomDamageSource extends DamageSource {
    public CustomDamageSource(RegistryEntry<DamageType> type) {
        super(type);
    }
}
