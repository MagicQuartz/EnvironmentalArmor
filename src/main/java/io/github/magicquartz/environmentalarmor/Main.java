package io.github.magicquartz.environmentalarmor;

import io.github.magicquartz.environmentalarmor.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "enva";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModArmor.register();
        ModEffects.register();
        ModOres.register();
    }

    public static Identifier identifier(String id) {
        return new Identifier(MOD_ID, id);
    }
}
