package io.github.magicquartz.environmentalarmor.registry;

import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.block.AirFilterBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {

    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)
            //.strength(4.0f)
            .requiresTool()
            //.breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.ANCIENT_DEBRIS));

    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
            //.strength(5.0f)
            .requiresTool()
            //.breakByTool(FabricToolTags.PICKAXES, 2)
            .sounds(BlockSoundGroup.NETHERITE));

    public static final Block AIR_FILTER = new AirFilterBlock(FabricBlockSettings.copyOf(Blocks.DISPENSER)
            //.strength(1.5f)
            .sounds(BlockSoundGroup.STONE));

    public static void register() {
        Registry.register(Registries.BLOCK, Main.identifier("titanium_ore"), TITANIUM_ORE);
        Registry.register(Registries.BLOCK, Main.identifier("titanium_block"), TITANIUM_BLOCK);

        Registry.register(Registries.BLOCK, Main.identifier("air_filter"), AIR_FILTER);
    }
}
