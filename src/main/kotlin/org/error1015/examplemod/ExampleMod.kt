package org.error1015.examplemod

import net.fabricmc.api.ModInitializer
import org.error1015.examplemod.item.ModItems

class ExampleMod : ModInitializer {

    override fun onInitialize() {
        ModItems.register()// 注册物品
        ModItemGroup.init()
    }

    companion object {
        const val MODID: String = "examplemod"
    }
}