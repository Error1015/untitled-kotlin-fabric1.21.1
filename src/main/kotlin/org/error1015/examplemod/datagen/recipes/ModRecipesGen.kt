package org.error1015.examplemod.datagen.recipes

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.registry.RegistryWrapper
import org.error1015.examplemod.item.ModItems
import java.util.concurrent.CompletableFuture

class ModRecipesGen(output: FabricDataOutput?, registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>?) : FabricRecipeProvider(output, registriesFuture) {
    override fun generate(exporter: RecipeExporter?) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUSTOM_ITEM)
            .pattern("A")
            .pattern("A")
            .pattern("A")
            .input('A', Items.NETHERITE_INGOT)
            .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
            .offerTo(exporter)
    }
}