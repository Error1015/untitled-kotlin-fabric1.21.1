package org.error1015.examplemod.blocks

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.error1015.examplemod.ExampleMod
import org.error1015.examplemod.blocks.custom.TestBlock
import org.error1015.examplemod.item.ModItems

object ModBlocks {
    val TEST_BLOCK: Block = registerBlock(TestBlock, "test_block", true)

    private fun registerBlock(
        block: Block,
        name: String,
        shouldRegisterItem: Boolean,
    ): Block {
        if (shouldRegisterItem) {
            ModItems.registerItem(name, BlockItem(block, Item.Settings()))
        }
        return Registry.register(Registries.BLOCK, Identifier.of(ExampleMod.MODID, name), block);
    }
}