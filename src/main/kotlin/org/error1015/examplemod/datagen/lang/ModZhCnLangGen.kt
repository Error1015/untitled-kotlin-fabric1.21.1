package org.error1015.examplemod.datagen.lang

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.RegistryWrapper
import org.error1015.examplemod.item.ModItems
import java.util.concurrent.CompletableFuture

class ModZhCnLangGen(output: FabricDataOutput, registryLookup: CompletableFuture<RegistryWrapper.WrapperLookup>) :
        FabricLanguageProvider(output, "zh_cn", registryLookup) {

    override fun generateTranslations(lookup: RegistryWrapper.WrapperLookup, builder: TranslationBuilder) {
        builder.add("itemGroup.examplemod.example_mod_group", "Example Mod Items")
        builder.add("example_mod_group", "Example Mod")

        builder.add(ModItems.CUSTOM_ITEM, "平平无奇之物")
        builder.add(ModItems.COOL_ITEM, "炫酷之物")
        builder.add(ModItems.MY_AGLET,"脚环")
        builder.add(ModItems.MY_PICK_AXE, "吾之镐")
        builder.add(ModItems.CURSED_RING, "七咒之戒")
        builder.add(ModItems.EXAMPLE_HELMET, "管理员头盔")
        builder.add(ModItems.EXAMPLE_CHESTPLATE, "管理员胸甲")
        builder.add(ModItems.EXAMPLE_LEGGINGS, "管理员护腿")
        builder.add(ModItems.EXAMPLE_BOOTS, "管理员靴子")

        builder.add("block.examplemod.test_block", "测试方块")

        builder.add("tooltip.item.examplemod.cursed_ring1", "§5一旦佩戴，它便成为你的一部分。")
        builder.add("tooltip.item.examplemod.cursed_ring2", "§4这枚戒指将永远陪伴着你。")
        builder.add("tooltip.item.examplemod.cursed_ring3", "§6需要神的能力才能取下它。")

        builder.add("tooltip.examplemod.cool_item", "雷神")
    }
}