package org.error1015.examplemod.item.armor

import net.minecraft.item.ArmorItem

object ExampleHelmet : ArmorItem(ModArmorMaterials.EXAMPLE, Type.HELMET, Settings().maxDamage(Type.HELMET.getMaxDamage(ArmorMaxDamage.EXAMPLE))) {

}