package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.armor.*;
import io.github.magicquartz.environmentalarmor.Main;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModArmor {
    public static final Item GLASS_HELMET = new ArmorItem(new GlassArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item WATER_GLASS_BOWL = new ArmorItem(new WaterGlassArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings());
    public static final Item GLASSES = new ArmorItem(new GlassesArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.COMMON));

    //Titanium Coated
    public static final Item TITANIUM_COATED_GLASS_HELMET = new ArmorItem(new TitaniumCoatedArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TITANIUM_COATED_WATER_GLASS_BOWL = new ArmorItem(new TitaniumCoatedArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings());

    // Titanium armor
    public static final Item TITANIUM_HELMET = new ArmorItem(new TitaniumArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(new TitaniumArmorMaterial(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(new TitaniumArmorMaterial(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TITANIUM_BOOTS = new ArmorItem(new TitaniumArmorMaterial(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(Registry.ITEM, Main.identifier("glass_helmet"), GLASS_HELMET);
        Registry.register(Registry.ITEM, Main.identifier("water_glass_bowl"), WATER_GLASS_BOWL);
        Registry.register(Registry.ITEM, Main.identifier("glasses"), GLASSES);

        //Titanium Coated
        Registry.register(Registry.ITEM, Main.identifier("titanium_coated_glass_helmet"), TITANIUM_COATED_GLASS_HELMET);
        Registry.register(Registry.ITEM, Main.identifier("titanium_coated_water_glass_bowl"), TITANIUM_COATED_WATER_GLASS_BOWL);

        // Titanium armor
        Registry.register(Registry.ITEM, Main.identifier("titanium_helmet"), TITANIUM_HELMET);
        Registry.register(Registry.ITEM, Main.identifier("titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, Main.identifier("titanium_leggings"), TITANIUM_LEGGINGS);
        Registry.register(Registry.ITEM, Main.identifier("titanium_boots"), TITANIUM_BOOTS);
    }
}
