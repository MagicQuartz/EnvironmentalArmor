package io.github.magicquartz.environmentalarmor.item;

import io.github.magicquartz.environmentalarmor.registry.ModArmor;
import io.github.magicquartz.environmentalarmor.registry.ModEffects;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class SunscreenItem extends ToolItem {

    public SunscreenItem(ToolMaterial material,  Settings settings) {
        super(material, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand){
        ItemStack item = playerEntity.getStackInHand(hand);
        int dmg = item.getDamage();
        if(dmg == item.getMaxDamage())
            item = new ItemStack(Items.AIR, 1);
        else
            item.setDamage(dmg + 1);
        playerEntity.addStatusEffect(new StatusEffectInstance(new StatusEffectInstance(ModEffects.SUNSCREEN, 12000, 0, false, false)));
        playerEntity.playSound(SoundEvents.ENTITY_GENERIC_DRINK, 1, 1);
        return new TypedActionResult<>(ActionResult.SUCCESS, item);
    }
}