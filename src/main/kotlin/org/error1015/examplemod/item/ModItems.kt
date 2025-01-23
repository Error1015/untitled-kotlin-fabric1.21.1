package org.error1015.examplemod.item

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import org.error1015.examplemod.MODID
import org.error1015.examplemod.item.armor.*
import org.error1015.examplemod.item.curios.CursedRing
import org.error1015.examplemod.item.curios.MyAglet
import org.error1015.examplemod.item.custom.CoolItem
import org.error1015.examplemod.item.tool.MyPickAxe

object ModItems {
    val CUSTOM_ITEM = registerItem("custom_item", Item(Item.Settings().rarity(Rarity.COMMON).maxCount(1)))
    val COOL_ITEM = registerItem("cool_item", CoolItem)
    val MY_PICK_AXE = registerItem("my_pickaxe", MyPickAxe)

    // Curios
    val MY_AGLET = registerItem("my_aglet", MyAglet)
    val CURSED_RING = registerItem("cursed_ring", CursedRing)

    // Armor
    val EXAMPLE_HELMET = registerItem("example_helmet", ExampleHelmet)
    val EXAMPLE_CHESTPLATE = registerItem("example_chestplate", ExampleChestPlate)
    val EXAMPLE_LEGGINGS = registerItem("example_leggings", ExampleLeggings)
    val EXAMPLE_BOOTS = registerItem("example_boots", ExampleBoots)

    internal fun <T : Item> registerItem(id: String, item: T): T = Registry.register(Registries.ITEM, Identifier.of(MODID, id), item)
}