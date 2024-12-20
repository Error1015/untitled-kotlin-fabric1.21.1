package org.error1015.examplemod

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import org.error1015.examplemod.blocks.ModBlocks
import org.error1015.examplemod.item.ModItems

object ModItemGroup {
    // 自定义物品栏
    private val ModGroup: ItemGroup = Registry.register(
        Registries.ITEM_GROUP,
        Identifier.of(ExampleMod.MODID, "example_mod_group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.examplemod.example_mod_group"))
            .icon { ModItems.CUSTOM_ITEM.defaultStack }
            .entries { _, entries ->
                // Items
                entries.add(ModItems.CUSTOM_ITEM)
                entries.add(ModItems.COOL_ITEM)
                entries.add(ModItems.MY_PICK_AXE)
                entries.add(ModItems.EXAMPLE_HELMET)
                entries.add(ModItems.EXAMPLE_CHESTPLATE)
                entries.add(ModItems.EXAMPLE_LEGGINGS)
                entries.add(ModItems.EXAMPLE_BOOTS)
                entries.add(ModItems.MYAGLET)
                // BlockItems
                entries.add(ModBlocks.TEST_BLOCK)
            }
            .build()
    )

    // 添加至已有物品栏
    private fun addItemToCreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ItemGroupEvents.ModifyEntries { entries ->
            entries.add(ModItems.CUSTOM_ITEM)
            entries.add(ModItems.COOL_ITEM)
        })
    }

    fun init() {
        addItemToCreativeTab()
    }
}
   