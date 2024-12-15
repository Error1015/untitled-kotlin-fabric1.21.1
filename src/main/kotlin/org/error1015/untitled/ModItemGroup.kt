package org.error1015.untitled

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.item.ItemGroups
import org.error1015.untitled.item.ModItems

object ModItemGroup {
    // 自定义物品栏
    private val ModGroup: ItemGroup = Registry.register(
        Registries.ITEM_GROUP,
        Identifier.of(Untitled.MODID, "example_mod_group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.untitled.example_mod_group"))
            .icon { ModItems.CUSTOM_ITEM.defaultStack }
            .entries { _, entries ->
                entries.add(ModItems.CUSTOM_ITEM)
                entries.add(ModItems.COOL_ITEM)
            }
            .build()
    )

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