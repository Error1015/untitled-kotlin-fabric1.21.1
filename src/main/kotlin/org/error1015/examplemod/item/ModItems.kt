package org.error1015.examplemod.item

import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import org.error1015.examplemod.ExampleMod
import org.error1015.examplemod.item.armor.ArmorMaxDamage
import org.error1015.examplemod.item.armor.ModArmorMaterials
import org.error1015.examplemod.item.custom.CoolItem
import org.error1015.examplemod.item.tool.MyPickAxe

object ModItems {
    val CUSTOM_ITEM: Item = register("custom_item", Item(Item.Settings().rarity(Rarity.COMMON).maxCount(1)))
    val COOL_ITEM: CoolItem = register("cool_item", CoolItem)
    val MY_PICK_AXE: MyPickAxe = register("my_pickaxe", MyPickAxe)
    // Armor
    val EXAMPLE_HELMET: ArmorItem = register("example_helmet", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.HELMET, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))
    val EXAMPLE_CHESTPLATE: ArmorItem = register("example_chestplate", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.CHESTPLATE, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))
    val EXAMPLE_LEGGINGS: ArmorItem = register("example_leggings", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.LEGGINGS, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))
    val EXAMPLE_BOOTS: ArmorItem = register("example_boots", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.BOOTS, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))

    private fun <T : Item> register(id: String, item: T): T =
        Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MODID, id), item)

    fun register() {}
}