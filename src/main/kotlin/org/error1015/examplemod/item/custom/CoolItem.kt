package org.error1015.examplemod.item.custom

import net.minecraft.entity.EntityType
import net.minecraft.entity.LightningEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


object CoolItem : Item(Settings().maxCount(1)) {
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        val stack: ItemStack = this.defaultStack
        if (!world!!.isClient || user == null) return TypedActionResult.pass(stack)
        val frontOfPlayer: BlockPos? = user.blockPos?.offset(user.horizontalFacing, 10) // 获取玩家水平方向10格的位置
        val lightningBolt = LightningEntity(EntityType.LIGHTNING_BOLT, world)
        lightningBolt.setPosition(frontOfPlayer?.toCenterPos())
        world.spawnEntity(lightningBolt)
        return TypedActionResult.success(stack)
    }

    override fun appendTooltip(
        stack: ItemStack?,
        context: TooltipContext?,
        tooltip: MutableList<Text>?,
        type: TooltipType?,
    ) {
        tooltip?.add(Text.translatable("tooltip.examplemod.cool_item").formatted(Formatting.GOLD))
    }
}