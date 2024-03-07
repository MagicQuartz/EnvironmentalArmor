package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.armor.*;
import io.github.magicquartz.environmentalarmor.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ModArmor {
    public static final Item GLASS_HELMET = new ArmorItem(new GlassArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item WATER_GLASS_BOWL = new ArmorItem(new WaterGlassArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item GLASSES = new ArmorItem(new GlassesArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings().rarity(Rarity.COMMON));

    //Titanium Coated
    public static final Item TITANIUM_COATED_GLASS_HELMET = new ArmorItem(new TitaniumCoatedArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item TITANIUM_COATED_WATER_GLASS_BOWL = new ArmorItem(new TitaniumCoatedArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings());

    // Titanium armor
    public static final Item TITANIUM_HELMET = new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item TITANIUM_BOOTS = new ArmorItem(new TitaniumArmorMaterial(), ArmorItem.Type.BOOTS, new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.ITEM, Main.identifier("glass_helmet"), GLASS_HELMET);
        Registry.register(Registries.ITEM, Main.identifier("water_glass_bowl"), WATER_GLASS_BOWL);
        Registry.register(Registries.ITEM, Main.identifier("glasses"), GLASSES);

        //Titanium Coated
        Registry.register(Registries.ITEM, Main.identifier("titanium_coated_glass_helmet"), TITANIUM_COATED_GLASS_HELMET);
        Registry.register(Registries.ITEM, Main.identifier("titanium_coated_water_glass_bowl"), TITANIUM_COATED_WATER_GLASS_BOWL);

        // Titanium armor
        Registry.register(Registries.ITEM, Main.identifier("titanium_helmet"), TITANIUM_HELMET);
        Registry.register(Registries.ITEM, Main.identifier("titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(Registries.ITEM, Main.identifier("titanium_leggings"), TITANIUM_LEGGINGS);
        Registry.register(Registries.ITEM, Main.identifier("titanium_boots"), TITANIUM_BOOTS);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(GLASS_HELMET);
            content.add(WATER_GLASS_BOWL);
            content.add(GLASSES);
            content.add(TITANIUM_COATED_GLASS_HELMET);
            content.add(TITANIUM_COATED_WATER_GLASS_BOWL);
            content.add(TITANIUM_HELMET);
            content.add(TITANIUM_CHESTPLATE);
            content.add(TITANIUM_LEGGINGS);
            content.add(TITANIUM_BOOTS);
        });
    }
}
