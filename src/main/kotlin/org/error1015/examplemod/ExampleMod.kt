package org.error1015.examplemod

import com.mojang.logging.LogUtils
import net.fabricmc.api.ModInitializer
import org.error1015.examplemod.blocks.ModBlocks
import org.error1015.examplemod.compoennt.ModComponents
import org.error1015.examplemod.item.ModItems
import org.error1015.examplemod.item.armor.ModArmorMaterials

class ExampleMod : ModInitializer {

    override fun onInitialize() {
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

    companion object {
        const val MODID: String = "examplemod"
        val Logger = LogUtils.getLogger()
    }
}