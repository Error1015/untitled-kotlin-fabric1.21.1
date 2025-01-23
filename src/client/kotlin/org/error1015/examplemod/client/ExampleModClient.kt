package org.error1015.examplemod.client

import com.mojang.logging.LogUtils
import org.slf4j.Logger


object ExampleModClient {
    private val Logger: Logger = LogUtils.getLogger()

    fun onClientSetup() {
        Logger.info("Kotlin client setup! ")
    }
}