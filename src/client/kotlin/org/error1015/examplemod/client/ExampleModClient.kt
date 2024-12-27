package org.error1015.examplemod.client

import net.fabricmc.api.ClientModInitializer

class ExampleModClient : ClientModInitializer {
    override fun onInitializeClient() {
        println("ExampleMod Client Initialized")
    }
}
