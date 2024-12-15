package org.error1015.untitled

import net.fabricmc.api.ModInitializer
import org.error1015.untitled.item.ModItems

class Untitled : ModInitializer {

    override fun onInitialize() {
        ModItems.register()// 注册物品
        CreativeTab.init()
    }

    companion object {
        const val MODID: String = "untitled"
    }
}