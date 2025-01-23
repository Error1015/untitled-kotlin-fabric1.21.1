package org.error1015.examplemod.datagen.tag

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.ItemTags
import org.error1015.examplemod.item.ModItems
import java.util.concurrent.CompletableFuture

class ModItemTagGen(output: FabricDataOutput, completableFuture: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricTagProvider.ItemTagProvider(output, completableFuture) {

    override fun configure(warrper: RegistryWrapper.WrapperLookup) {
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.EXAMPLE_HELMET)
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.EXAMPLE_CHESTPLATE)
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.EXAMPLE_LEGGINGS)
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.EXAMPLE_BOOTS)
    }
}