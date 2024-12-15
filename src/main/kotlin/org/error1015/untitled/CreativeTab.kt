package org.error1015.untitled

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.item.ItemGroups
import org.error1015.untitled.item.ModItems


object CreativeTab {
    private fun addItemToCreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModifyEntries { entries: FabricItemGroupEntries ->
            entries.add(ModItems.CUSTOM_ITEM)
            entries.add(ModItems.COOL_ITEM)
        })
    }

    fun init() {
        addItemToCreativeTab()
    }
}