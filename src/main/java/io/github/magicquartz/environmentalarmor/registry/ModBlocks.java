package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.block.AirFilterBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 20.0f)
            .sounds(BlockSoundGroup.ANCIENT_DEBRIS));

    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 30.0f)
            .sounds(BlockSoundGroup.METAL));

    public static final Block AIR_FILTER = new AirFilterBlock(FabricBlockSettings
            .of(Material.PISTON)
            .breakByHand(true)
            .sounds(BlockSoundGroup.STONE));

    public static void register() {
        Registry.register(Registry.BLOCK, Main.identifier("titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.BLOCK, Main.identifier("titanium_block"), TITANIUM_BLOCK);

        Registry.register(Registry.BLOCK, Main.identifier("air_filter"), AIR_FILTER);
    }
}
