package io.github.magicquartz.environmentalarmor.item;

import io.github.magicquartz.environmentalarmor.registry.ModArmor;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class GlassBowlItem extends Item {

    public GlassBowlItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand){
        BlockHitResult blockHit = raycast(world, playerEntity, RaycastContext.FluidHandling.SOURCE_ONLY);
        if(blockHit.getType().equals(HitResult.Type.BLOCK)) {
            BlockPos blockPos = blockHit.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            if(blockState.getMaterial().equals(Material.WATER)) {
                playerEntity.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
                world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                return new TypedActionResult<>(ActionResult.SUCCESS,  new ItemStack(ModArmor.WATER_GLASS_BOWL, 1));
            } else {
                return new TypedActionResult<>(ActionResult.PASS, playerEntity.getStackInHand(hand));
            }
        } else {
            return new TypedActionResult<>(ActionResult.PASS, playerEntity.getStackInHand(hand));
        }
    }
}