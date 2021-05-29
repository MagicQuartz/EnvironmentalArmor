package io.github.magicquartz.environmentalarmor.extensions;

import io.github.magicquartz.environmentalarmor.model.GlassesModel;
import io.github.magicquartz.environmentalarmor.model.waterGlassBowlModel;
import io.github.magicquartz.environmentalarmor.registry.ModArmor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CustomArmorFeatureRenderer<T extends LivingEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {
    private static final Identifier GLASSES_TEXTURE = new Identifier("textures/armor/glasses.png");
    private static final Identifier WATER_GLASS_BOWL_TEXTURE = new Identifier("textures/armor/water_glass_bowl.png");

    private final GlassesModel<T> glassesHelmet = new GlassesModel<>();
    private final waterGlassBowlModel<T> waterGlassBowl = new waterGlassBowlModel<>();

    public CustomArmorFeatureRenderer(FeatureRendererContext<T, M> featureRendererContext) {
        super(featureRendererContext);
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T livingEntity, float f, float g, float h, float j, float k, float l) {
        ItemStack headItem = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
        if(!headItem.isEmpty()) {
            if (headItem.getItem() == ModArmor.GLASSES) {
                matrixStack.push();
                matrixStack.translate(0.0D, 0.0D, 0.0D);
                this.getContextModel().copyStateTo(this.glassesHelmet);
                this.glassesHelmet.setAngles(livingEntity, f, g, j, k, l);
                VertexConsumer vertexConsumer = ItemRenderer.getArmorGlintConsumer(
                        vertexConsumerProvider,
                        RenderLayer.getArmorCutoutNoCull(GLASSES_TEXTURE),
                        false, headItem.hasGlint()
                );
                this.glassesHelmet.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
                matrixStack.pop();
            } else if (headItem.getItem() == ModArmor.WATER_GLASS_BOWL) {
                matrixStack.push();
                matrixStack.translate(0.0D, 0.0D, 0.0D);
                this.getContextModel().copyStateTo(this.waterGlassBowl);
                this.waterGlassBowl.setAngles(livingEntity, f, g, j, k, l);
                VertexConsumer vertexConsumer = ItemRenderer.getArmorGlintConsumer(
                        vertexConsumerProvider,
                        RenderLayer.getArmorCutoutNoCull(WATER_GLASS_BOWL_TEXTURE),
                        false, headItem.hasGlint()
                );
                this.waterGlassBowl.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
                matrixStack.pop();
            }
        }
    }
}