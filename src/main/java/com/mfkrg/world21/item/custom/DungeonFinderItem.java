package com.mfkrg.world21.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

public class DungeonFinderItem extends Item {
    public DungeonFinderItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            int radius = 32;
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                        Block blockBelow = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();

                        if (isValuableBlock(blockBelow)) {
                            outputValuableCoordinates(positionClicked.below(i), player, blockBelow);
                            foundBlock = true;
                            break;
                        }
            }

            if (!foundBlock){
                player.sendMessage(new TextComponent("Fuck u man"), player.getUUID());
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);

    }

    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block blockBelow){
        player.sendMessage(new TextComponent("Found dungeon at ("+blockPos.getX() +
                ", " + blockPos.getY() + ", "+ blockPos.getZ() + ")"), player.getUUID());
    }

    private boolean isValuableBlock(Block block){
        return block == Blocks.MOSSY_COBBLESTONE || block == Blocks.MOSSY_STONE_BRICK_WALL || block == Blocks.SPAWNER;
    }

}
