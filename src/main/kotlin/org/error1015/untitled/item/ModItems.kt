package org.error1015.untitled.item

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import org.error1015.untitled.Untitled
import org.error1015.untitled.item.custom.CoolItem

data object ModItems {
    val CUSTOM_ITEM = register("custom_item", Item(Item.Settings().rarity(Rarity.COMMON).maxCount(1)))
    val COOL_ITEM = register("cool_item", CoolItem)

    private fun <T : Item> register(id: String, item: T): T =
        Registry.register(Registries.ITEM, Identifier.of(Untitled.MODID, id), item)

    fun register() {}
}