package com.mfkrg.world21.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class MythrilStaff extends Item {
    public MythrilStaff (Properties pPropetries){
        super(pPropetries);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack pStack, Player pPlayer, LivingEntity pInteractionTarget, InteractionHand pUsedHand) {
        double ePosX = pInteractionTarget.getX();
        double ePosY = pInteractionTarget.getY();
        double ePosZ = pInteractionTarget.getZ();
        float vamp = pInteractionTarget.getHealth();
        float pPlayerHealth = pPlayer.getHealth();
        pPlayer.setHealth(pPlayerHealth + vamp);
        pInteractionTarget.hurt(DamageSource.playerAttack(pPlayer),400);

        pPlayer.getItemInHand(InteractionHand.MAIN_HAND).hurtAndBreak(1, pPlayer, (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.interactLivingEntity(pStack, pPlayer, pInteractionTarget, pUsedHand);
    }
}
