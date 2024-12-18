package org.error1015.examplemod

import net.fabricmc.api.ModInitializer
import org.error1015.examplemod.item.ModItems
import org.error1015.examplemod.item.armor.ModArmorMaterials

class ExampleMod : ModInitializer {

    override fun onInitialize() {
        ModItems.register()// 注册物品
        ModItemGroup.init()
        ModArmorMaterials.init()
    }

    companion object {
        const val MODID: String = "examplemod"
    }
}