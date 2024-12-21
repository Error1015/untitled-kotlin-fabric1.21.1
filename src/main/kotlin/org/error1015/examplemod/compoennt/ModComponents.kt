package org.error1015.examplemod.compoennt

import com.mojang.serialization.Codec
import net.minecraft.component.ComponentType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.error1015.examplemod.ExampleMod

object ModComponents {
    val CLICK_COUNT_COMPONENT: ComponentType<Int> = registerComponent(
        Registries.DATA_COMPONENT_TYPE, "click_count", Codec.INT
    )

    private fun <T> registerComponent(
        type: Registry<ComponentType<*>>,
        path: String,
        codec: Codec<T>,
    ): ComponentType<T> = Registry.register(
        type, Identifier.of(ExampleMod.MODID, path), ComponentType.builder<T>().codec(codec).build()
    )
}