package org.error1015.examplemod.item.tool

import net.minecraft.item.ItemStack
import net.minecraft.item.PickaxeItem
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.text.Style
import net.minecraft.text.Text
import org.error1015.examplemod.item.tool.material.Material

object MyPickAxe : PickaxeItem(Material.ANCESTOR, Settings().maxCount(1)) {
    override fun appendTooltip(
        stack: ItemStack?,
        context: TooltipContext?,
        tooltip: MutableList<Text>?,
        type: TooltipType?
    ) {
        tooltip?.apply {
            add(Text.of("挖的特别快!"))
        }
    }
}