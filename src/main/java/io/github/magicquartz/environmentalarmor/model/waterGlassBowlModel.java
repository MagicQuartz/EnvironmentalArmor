package io.github.magicquartz.environmentalarmor.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

public class waterGlassBowlModel<T extends LivingEntity> extends EntityModel<T> {
    private final ModelPart waterGlassBowl;
    private final ModelPart outline;
    private final ModelPart water;
    public waterGlassBowlModel() {
        textureWidth = 16;
        textureHeight = 32;
        waterGlassBowl = new ModelPart(this);
        waterGlassBowl.setPivot(0.0F, 0F, 0.0F);


        outline = new ModelPart(this);
        outline.setPivot(0.0F, 0.0F, 0.0F);
        waterGlassBowl.addChild(outline);
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

        water = new ModelPart(this);
        water.setPivot(0.0F, 0.0F, 0.0F);
        water.setTextureOffset(0, 16).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        waterGlassBowl.pitch = headPitch * 0.017453292F;
        waterGlassBowl.yaw = headYaw * 0.017453292F;
        water.pitch = headPitch * 0.017453292F;
        water.yaw = headYaw * 0.017453292F;
    }

    /*public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        waterGlassBowl.pitch = headPitch * 0.017453292F;
        waterGlassBowl.yaw = netHeadYaw * 0.017453292F;
    }*/

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        waterGlassBowl.render(matrixStack, buffer, packedLight, packedOverlay);
        water.render(matrixStack, buffer, packedLight, packedOverlay, 1F, 1F, 1F, 0.5F);
    }
    /*public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }*/
}