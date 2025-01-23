package org.error1015.examplemod.datagen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import org.error1015.examplemod.datagen.tag.ModBlockTagsGen
import org.error1015.examplemod.datagen.tag.ModItemTagGen
import org.error1015.examplemod.datagen.lang.ModEnUsLangGen
import org.error1015.examplemod.datagen.lang.ModZhCnLangGen
import org.error1015.examplemod.datagen.recipes.ModRecipesGen

object ExampleModDataGen : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        val pack = fabricDataGenerator.createPack()
        pack.addProvider(::ModBlockTagsGen)
        pack.addProvider(::ModItemTagGen)
        pack.addProvider(::ModZhCnLangGen)
        pack.addProvider(::ModEnUsLangGen)
        pack.addProvider(::ModRecipesGen)

    }
}