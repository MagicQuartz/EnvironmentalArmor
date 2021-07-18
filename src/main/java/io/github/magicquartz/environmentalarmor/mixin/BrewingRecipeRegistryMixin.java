package io.github.magicquartz.environmentalarmor.mixin;

import io.github.magicquartz.environmentalarmor.registry.ModEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingRecipeRegistryMixin {

    @Inject(method = "registerDefaults", at = @At("HEAD"))
    private static void addPotionRecipes(CallbackInfo ci) {
        BrewingRecipeRegistryAccessor.getPotionRegistry(Potions.AWKWARD, Items.SCUTE, ModEffects.WATER_RESISTANCE_POTION_SHORT);
        BrewingRecipeRegistryAccessor.getPotionRegistry(ModEffects.WATER_RESISTANCE_POTION_SHORT, Items.REDSTONE, ModEffects.WATER_RESISTANCE_POTION_LONG);
    }
}