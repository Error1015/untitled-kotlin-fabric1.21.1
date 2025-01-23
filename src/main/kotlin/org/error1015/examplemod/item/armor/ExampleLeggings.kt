package org.error1015.examplemod.item.armor

import net.minecraft.item.ArmorItem

object ExampleLeggings : ArmorItem(ModArmorMaterials.EXAMPLE, Type.LEGGINGS, Settings().maxDamage(Type.LEGGINGS.getMaxDamage(ArmorMaxDamage.EXAMPLE)))