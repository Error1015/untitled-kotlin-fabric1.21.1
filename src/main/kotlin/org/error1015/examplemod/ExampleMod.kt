package org.error1015.examplemod

import com.mojang.logging.LogUtils
import org.error1015.examplemod.blocks.ModBlocks
import org.error1015.examplemod.compoennt.ModComponents
import org.error1015.examplemod.item.ModItems
import org.error1015.examplemod.item.armor.ModArmorMaterials
import org.slf4j.Logger

const val MODID: String = "examplemod"

object ExampleMod {
    private val Logger: Logger = LogUtils.getLogger()

    fun onInitialize() {
        init()
        Logger.info("ExampleMod Load!")
    }

    private fun init() {
        ModItems
        ModBlocks
        ModItemGroup
        ModArmorMaterials
        ModComponents
    }
}