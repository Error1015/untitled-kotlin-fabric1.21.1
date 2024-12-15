package org.error1015.examplemod.item.custom

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.text.Text
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

object CoolItem : Item(Settings().maxCount(1)) {
    override fun use(world: World?, player: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        val stack: ItemStack = this.defaultStack
        if (world?.isClient()!! && hand == Hand.MAIN_HAND && player != null) {
            player.setPos(player.x + 100, player.y, player.z + 100)
            player.sendMessage(Text.of("传送成功"), true)
            return TypedActionResult.pass(stack)
        }
        return TypedActionResult.fail(stack)
    }

    override fun appendTooltip(
        stack: ItemStack?,
        context: TooltipContext?,
        tooltip: MutableList<Text>?,
        type: TooltipType?,
    ) {
        tooltip?.add(Text.translatable("tooltip.examplemod.cool_item"))
    }
}