package io.github.magicquartz.environmentalarmor.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

public class NewWaterGlassBowlModel extends BipedEntityModel<LivingEntity> {

    public NewWaterGlassBowlModel() {
        super(RenderLayer::getEntityTranslucent, 0.5F, 0, 64, 64);

        setVisible(false);
        head.visible = true;
        helmet.visible = true;

        ModelPart outline = new ModelPart(this);
        ModelPart water = new ModelPart(this);

        outline.setTextureOffset(0, 0).addCuboid(4.0F, -9.0F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-5.0F, -9.0F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-5.0F, -9.0F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 2).addCuboid(-4.0F, -9.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-4.0F, 0.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-4.0F, 0.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        outline.setTextureOffset(0, 1).addCuboid(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(4.0F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(-5.0F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        outline.setTextureOffset(0, 0).addCuboid(4.0F, -9.0F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        water.setTextureOffset(0, 16).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        head.addChild(outline);
        head.addChild(water);

        water.pitch = 0.5F;
    }
}