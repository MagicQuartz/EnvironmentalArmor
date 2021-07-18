package io.github.magicquartz.environmentalarmor.mixin;

import io.github.magicquartz.environmentalarmor.registry.ModArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    @Shadow @Final private DefaultedList<ItemStack> equippedArmor;

    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Shadow public abstract boolean hasStatusEffect(StatusEffect effect);

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {
        ItemStack helmetStack = equippedArmor.get(3);
        if(helmetStack.getItem().equals(ModArmor.WATER_GLASS_BOWL) || helmetStack.getItem().equals(ModArmor.TITANIUM_COATED_WATER_GLASS_BOWL)) {
            if(!isSubmergedInWater()) {
                if(!hasStatusEffect(StatusEffects.WATER_BREATHING)) {
                    addStatusEffect(new StatusEffectInstance(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 70, 0, false, false)));
                }
            }
        } if(helmetStack.getItem().equals(ModArmor.GLASS_HELMET) || helmetStack.getItem().equals(ModArmor.TITANIUM_COATED_GLASS_HELMET)) {
            if(isSubmergedInWater()) {
                if(!hasStatusEffect(StatusEffects.WATER_BREATHING)) {
                    addStatusEffect(new StatusEffectInstance(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 70, 0, false, false)));
                }
            }
        }
    }
}
