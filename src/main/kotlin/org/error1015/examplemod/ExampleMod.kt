package org.error1015.examplemod

import net.fabricmc.api.ModInitializer
import org.error1015.examplemod.blocks.ModBlocks
import org.error1015.examplemod.compoennt.ModComponents
import org.error1015.examplemod.item.ModItems
import org.error1015.examplemod.item.armor.ModArmorMaterials

class ExampleMod : ModInitializer {

    override fun onInitialize() {
        init()
    }

    private fun init() {
        ModItems.init() // Items
        ModBlocks.init() // Blocks
        ModItemGroup.init() // Item Group
        ModArmorMaterials.init() // Armor Material
        ModComponents.init() // Component
    }

    companion object {
        const val MODID: String = "examplemod"
    }
}