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
import org.error1015.examplemod.item.curios.MyAglet
import org.error1015.examplemod.item.custom.CoolItem
import org.error1015.examplemod.item.tool.MyPickAxe

object ModItems {
    val CUSTOM_ITEM: Item = registerItem("custom_item", Item(Item.Settings().rarity(Rarity.COMMON).maxCount(1)))
    val COOL_ITEM: CoolItem = registerItem("cool_item", CoolItem)
    val MY_PICK_AXE: MyPickAxe = registerItem("my_pickaxe", MyPickAxe)

    // Curios
    val MYAGLET = registerItem("my_aglet", MyAglet)
    // Armor
    val EXAMPLE_HELMET: ArmorItem = registerItem("example_helmet", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.HELMET, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))
    val EXAMPLE_CHESTPLATE: ArmorItem = registerItem("example_chestplate", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.CHESTPLATE, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))
    val EXAMPLE_LEGGINGS: ArmorItem = registerItem("example_leggings", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.LEGGINGS, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))
    val EXAMPLE_BOOTS: ArmorItem = registerItem("example_boots", ArmorItem(ModArmorMaterials.EXAMPLE, ArmorItem.Type.BOOTS, Item.Settings().maxDamage(ArmorMaxDamage.EXAMPLE)))


    fun <T : Item> registerItem(id: String, item: T): T = Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MODID, id), item)

    fun init() {}
}