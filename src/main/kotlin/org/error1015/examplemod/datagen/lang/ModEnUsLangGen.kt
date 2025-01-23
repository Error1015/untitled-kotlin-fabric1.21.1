package org.error1015.examplemod.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import org.error1015.examplemod.item.ModItems
import java.util.concurrent.CompletableFuture

class ModEnUsLangGen(output: FabricDataOutput, registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricLanguageProvider(output, "en_us", registryLookup) {
    override fun generateTranslations(lookup: RegistryWrapper.WrapperLookup, builder: TranslationBuilder) {
        builder.add("itemGroup.examplemod.example_mod_group", "Example Mod Items")
        builder.add("example_mod_group", "Example Mod")

        // Items
        builder.add(ModItems.CUSTOM_ITEM, "Custom Item")
        builder.add(ModItems.COOL_ITEM, "Cool Item")
        builder.add(ModItems.MY_AGLET, "My Aglet")
        builder.add(ModItems.MY_PICK_AXE, "My Pickaxe")
        builder.add(ModItems.CURSED_RING, "Cursed Ring")
        builder.add(ModItems.EXAMPLE_HELMET, "Example Helmet")
        builder.add(ModItems.EXAMPLE_CHESTPLATE, "Example Chestplate")
        builder.add(ModItems.EXAMPLE_LEGGINGS, "Example Leggings")
        builder.add(ModItems.EXAMPLE_BOOTS, "Example Boots")

        // Blocks
        builder.add("block.examplemod.test_block", "Test Block")

        // Tooltips
        builder.add("tooltip.item.examplemod.cursed_ring1", "Only Creative")
        builder.add("tooltip.item.examplemod.cursed_ring2", "Can Unequip it")
        builder.add("tooltip.item.examplemod.cursed_ring3", "§6需要神的能力才能取下它。")

        builder.add("tooltip.examplemod.cool_item", "spawn lighting!")

    }
}