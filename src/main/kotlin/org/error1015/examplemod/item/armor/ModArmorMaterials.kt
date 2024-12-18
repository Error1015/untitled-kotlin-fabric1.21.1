package org.error1015.examplemod.item.armor

import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Identifier
import org.error1015.examplemod.ExampleMod
import org.error1015.examplemod.item.ModItems


object ModArmorMaterials {
    fun init() {}

    val EXAMPLE = registerMaterial(
        "example",
        java.util.Map.of(
            ArmorItem.Type.HELMET, 3,
            ArmorItem.Type.CHESTPLATE, 8,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 3
        ),
        22,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
        { Ingredient.ofItems(ModItems.COOL_ITEM) },
        25.0f,
        2.0f,
        false
    )

    fun registerMaterial(
        id: String,
        defensePoints: Map<ArmorItem.Type, Int>,
        enchantability: Int,
        equipSound: RegistryEntry<SoundEvent>,
        repairIngredientSupplier: () -> Ingredient,
        toughness: Float,
        knockbackResistance: Float,
        dyeable: Boolean,
    ): RegistryEntry<ArmorMaterial> {
        val list = listOf(ArmorMaterial.Layer(Identifier.of(ExampleMod.MODID, id), "", dyeable))
        var material = ArmorMaterial(
            defensePoints, enchantability, equipSound, repairIngredientSupplier, list, toughness, knockbackResistance
        )
        material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(ExampleMod.MODID, id), material)
        return RegistryEntry.of(material);
    }

}