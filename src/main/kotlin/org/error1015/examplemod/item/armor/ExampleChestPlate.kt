package org.error1015.examplemod.item.armor

import net.minecraft.item.ArmorItem

object ExampleChestPlate: ArmorItem(ModArmorMaterials.EXAMPLE, Type.CHESTPLATE, Settings().maxDamage(Type.CHESTPLATE.getMaxDamage(ArmorMaxDamage.EXAMPLE))) {}