package org.error1015.examplemod.datagen.tag

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.BlockTags
import org.error1015.examplemod.blocks.ModBlocks
import java.util.concurrent.CompletableFuture

class ModBlockTagsGen(output: FabricDataOutput?, registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>?) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    override fun configure(warper: RegistryWrapper.WrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.TEST_BLOCK)

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.TEST_BLOCK)
    }
}