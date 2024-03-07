package io.github.magicquartz.environmentalarmor.armor;

import io.github.magicquartz.environmentalarmor.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TitaniumArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {1, 4, 5, 2}; // Boots, Leggings, Chestplate, Helmet

    public int getDurabilityAmount(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 30;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return getDurabilityAmount(type.getEquipmentSlot());
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return getProtectionAmount(type.getEquipmentSlot());
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.TITANIUM_INGOT);
    }

    @Override
    public String getName() {
        return "titanium";
    }

    @Override
    public float getToughness() {
        return 4F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
