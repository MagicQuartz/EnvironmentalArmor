package io.github.magicquartz.environmentalarmor.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class GlassesArmorMaterial implements ArmorMaterial {

    @Override
    public int getDurability(ArmorItem.Type type) {
        return 5;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GLASS);
    }

    @Override
    public String getName() {
        return "glasses";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
