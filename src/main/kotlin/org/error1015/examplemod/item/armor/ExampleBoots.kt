package org.error1015.examplemod.item.armor

import net.minecraft.item.ArmorItem

object ExampleBoots: ArmorItem(ModArmorMaterials.EXAMPLE, Type.BOOTS, Settings().maxDamage(Type.BOOTS.getMaxDamage(ArmorMaxDamage.EXAMPLE))) {}