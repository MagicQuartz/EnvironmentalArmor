package io.github.magicquartz.environmentalarmor.armor;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.registry.ModItems;

import java.util.EnumMap;
import java.util.List;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

public class Materials {
	public static final RegistryEntry<ArmorMaterial> GLASS;
	public static final RegistryEntry<ArmorMaterial> WATER_GLASS;
	public static final RegistryEntry<ArmorMaterial> GLASSES;
	public static final RegistryEntry<ArmorMaterial> TITANIUM;
	public static final RegistryEntry<ArmorMaterial> TITANIUM_COATED;
	
	static {
		GLASS = Registry.registerReference(Registries.ARMOR_MATERIAL, Main.identifier("glass"), new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
			map.put(ArmorItem.Type.BOOTS, 1);
			map.put(ArmorItem.Type.LEGGINGS, 1);
			map.put(ArmorItem.Type.CHESTPLATE, 1);
			map.put(ArmorItem.Type.HELMET, 1);
			map.put(ArmorItem.Type.BODY, 1);
		}), 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(Items.GLASS), List.of(new ArmorMaterial.Layer(Main.identifier("glass"))), 1, 0));
		WATER_GLASS = Registry.registerReference(Registries.ARMOR_MATERIAL, Main.identifier("water_glass"), new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
			map.put(ArmorItem.Type.BOOTS, 1);
			map.put(ArmorItem.Type.LEGGINGS, 1);
			map.put(ArmorItem.Type.CHESTPLATE, 1);
			map.put(ArmorItem.Type.HELMET, 1);
			map.put(ArmorItem.Type.BODY, 1);
		}), 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(Items.GLASS), List.of(new ArmorMaterial.Layer(Main.identifier("water_glass"))), 1, 2));
		GLASSES = Registry.registerReference(Registries.ARMOR_MATERIAL, Main.identifier("glasses"), new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
			map.put(ArmorItem.Type.BOOTS, 1);
			map.put(ArmorItem.Type.LEGGINGS, 1);
			map.put(ArmorItem.Type.CHESTPLATE, 1);
			map.put(ArmorItem.Type.HELMET, 1);
			map.put(ArmorItem.Type.BODY, 1);
		}), 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(Items.GLASS), List.of(new ArmorMaterial.Layer(Main.identifier("glasses"))), 0, 0));
		TITANIUM = Registry.registerReference(Registries.ARMOR_MATERIAL, Main.identifier("titanium"), new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
			map.put(ArmorItem.Type.BOOTS, 1);
			map.put(ArmorItem.Type.LEGGINGS, 4);
			map.put(ArmorItem.Type.CHESTPLATE, 5);
			map.put(ArmorItem.Type.HELMET, 2);
			map.put(ArmorItem.Type.BODY, 4);
		}), 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT), List.of(new ArmorMaterial.Layer(Main.identifier("titanium"))), 4F, 0.5F));
		TITANIUM_COATED = Registry.registerReference(Registries.ARMOR_MATERIAL, Main.identifier("titanium_coated_glass"), new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
			map.put(ArmorItem.Type.BOOTS, 2);
			map.put(ArmorItem.Type.LEGGINGS, 2);
			map.put(ArmorItem.Type.CHESTPLATE, 2);
			map.put(ArmorItem.Type.HELMET, 2);
			map.put(ArmorItem.Type.BODY, 2);
		}), 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT), List.of(new ArmorMaterial.Layer(Main.identifier("titanium_coated_glass"))), 1, 0));
	}
}
