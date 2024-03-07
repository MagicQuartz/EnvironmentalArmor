package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.item.GlassBowlItem;
import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.item.SunscreenItem;
import io.github.magicquartz.environmentalarmor.item.TitaniumCoatedGlassBowlItem;
import io.github.magicquartz.environmentalarmor.toolmaterials.TitaniumToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {

    //Glass bowl
    public static final Item GLASS_BOWL = new GlassBowlItem(new Item.Settings().maxCount(1));
    public static final Item TITANIUM_COATED_GLASS_BOWL = new TitaniumCoatedGlassBowlItem(new Item.Settings().maxCount(1));

    // Titanium
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings());
    public static final Item TITANIUM_DUST = new Item(new Item.Settings());
    public static final BlockItem TITANIUM_ORE = new BlockItem(ModBlocks.TITANIUM_ORE, new FabricItemSettings());
    public static final BlockItem TITANIUM_BLOCK = new BlockItem(ModBlocks.TITANIUM_BLOCK, new FabricItemSettings());
    public static final BlockItem AIR_FILTER = new BlockItem(ModBlocks.AIR_FILTER, new FabricItemSettings());

    //Sunscreen
    public static final ToolItem SUNSCREEN = new SunscreenItem(new TitaniumToolMaterial(), new Item.Settings().maxCount(1).maxDamage(3));

    public static void register() {
        //Glass bowl
        Registry.register(Registries.ITEM, Main.identifier("glass_bowl"), GLASS_BOWL);
        Registry.register(Registries.ITEM, Main.identifier("titanium_coated_glass_bowl"), TITANIUM_COATED_GLASS_BOWL);

        // Titanium
        Registry.register(Registries.ITEM, Main.identifier("titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registries.ITEM, Main.identifier("titanium_dust"), TITANIUM_DUST);
        Registry.register(Registries.ITEM, Main.identifier("titanium_ore"), TITANIUM_ORE);
        Registry.register(Registries.ITEM, Main.identifier("titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registries.ITEM, Main.identifier("air_filter"), AIR_FILTER);

        //Sunscreen
        Registry.register(Registries.ITEM, Main.identifier("sunscreen"), SUNSCREEN);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(GLASS_BOWL);
            content.add(TITANIUM_COATED_GLASS_BOWL);
            content.add(SUNSCREEN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(TITANIUM_INGOT);
            content.add(TITANIUM_DUST);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(TITANIUM_ORE);
            content.add(TITANIUM_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            content.add(AIR_FILTER);
        });
    }
}
