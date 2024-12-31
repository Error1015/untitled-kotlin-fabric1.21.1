package org.error1015.examplemod.item.custom

import net.minecraft.component.type.FoodComponent
import net.minecraft.entity.LivingEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.text.Text
import net.minecraft.world.World

object ErrorItem : Item(Settings().food(FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).alwaysEdible().build())) {
    override fun finishUsing(stack: ItemStack?, world: World?, user: LivingEntity?): ItemStack = throw NullPointerException()

    override fun appendTooltip(stack: ItemStack?, context: TooltipContext?, tooltip: MutableList<Text>?, type: TooltipType?) {
        tooltip?.apply {
            add(Text.of("吃下会崩溃!"))
        }
    }
}