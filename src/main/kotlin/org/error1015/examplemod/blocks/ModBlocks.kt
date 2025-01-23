package org.error1015.examplemod.blocks

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.error1015.examplemod.MODID
import org.error1015.examplemod.blocks.custom.TestBlock
import org.error1015.examplemod.item.ModItems

object ModBlocks {
    val TEST_BLOCK: Block = registerBlockWithItem(TestBlock, "test_block")

    /**
     * 注册方块 不注册物品
     */
    private fun registerBlock(block: Block, name: String): Block =
        Registry.register(Registries.BLOCK, Identifier.of(MODID, name), block)

    /**
     * 注册方块的同时注册它的物品
     */
    private fun registerBlockWithItem(
        block: Block,
        id: String
    ): Block {
        ModItems.registerItem(id, BlockItem(block, Item.Settings()))
        return Registry.register(Registries.BLOCK, Identifier.of(MODID, id), block)
    }
}