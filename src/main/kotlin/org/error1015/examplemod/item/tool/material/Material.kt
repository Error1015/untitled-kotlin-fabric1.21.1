package org.error1015.examplemod.item.tool.material

import net.minecraft.block.Block
import net.minecraft.item.Items
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.registry.tag.BlockTags
import net.minecraft.registry.tag.TagKey
import java.util.function.Supplier

enum class Material(
    private val tagKey: TagKey<Block>?,
    private val itemDurability: Int,
    private val miningSpeed: Float,
    private val attackDamage: Float,
    private val enchantability: Int,
    private val repairIngredient: Supplier<Ingredient?>?,
) : ToolMaterial {
    ANCESTOR(
        BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 114514, 1145f, 1145f, 24, { Ingredient.ofItems(Items.DIAMOND_BLOCK) });

    override fun getDurability(): Int = itemDurability

    override fun getMiningSpeedMultiplier(): Float = miningSpeed

    override fun getAttackDamage(): Float = attackDamage

    override fun getInverseTag(): TagKey<Block>? = tagKey

    override fun getEnchantability(): Int = enchantability

    override fun getRepairIngredient(): Ingredient? = repairIngredient?.get()

}