package org.error1015.examplemod.item.tool

import net.minecraft.item.PickaxeItem
import org.error1015.examplemod.item.tool.material.Material

object MyPickAxe : PickaxeItem(Material.ANCESTOR, Settings().maxCount(1))