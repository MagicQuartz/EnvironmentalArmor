package io.github.magicquartz.environmentalarmor.item;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.Trinket;
import io.github.magicquartz.environmentalarmor.Main;
import io.github.magicquartz.environmentalarmor.armor.WaterGlassArmorMaterial;
import io.github.magicquartz.environmentalarmor.model.NewWaterGlassBowlModel;
import io.github.magicquartz.environmentalarmor.registry.ModArmor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.DispenserBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.List;

public class WaterGlassBowlItem extends Item implements Trinket {
    public WaterGlassBowlItem(Settings settings) {
        super(/*new WaterGlassArmorMaterial(), EquipmentSlot.HEAD,*/ settings);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    private static final Identifier TEXTURE = Main.identifier("textures/entity/trinket/water_glass_bowl.png");

    @Environment(EnvType.CLIENT)
    protected BipedEntityModel<LivingEntity> createModel() {
        return new NewWaterGlassBowlModel();
    }

    @Environment(EnvType.CLIENT)
    protected Identifier getTexture() {
        return TEXTURE;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("text.water_glass_bowl"));
    }

    @Override
    public boolean canWearInSlot(String group, String slot) {
        return group.equals(SlotGroups.HEAD) && slot.equals(Slots.MASK);
    }
}