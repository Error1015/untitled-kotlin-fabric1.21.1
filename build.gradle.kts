import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.1.0"
    id("fabric-loom") version "1.9.1"
    id("maven-publish")
}

version = project.property("mod_version") as String
group = project.property("maven_group") as String

base {
    archivesName.set(project.property("archives_base_name") as String)
}

val targetJavaVersion = 21
java {
    toolchain.languageVersion = JavaLanguageVersion.of(targetJavaVersion)
    withSourcesJar()
}

loom {
    splitEnvironmentSourceSets()

    mods {
        register("ExampleMod") {
            sourceSet("main")
            sourceSet("client")
        }
    }
}

fabricApi {
    configureDataGeneration {
        outputDirectory = file("src/main/generated")
    }
}

repositories {
    maven("https://maven.terraformersmc.com/") { name = "Terraformers - ModMenu" }
    maven("https://maven.terraformersmc.com/") { name = "TerraformersMc - ModMenu" }
    maven("https://maven.ladysnake.org/releases") { name = "Trinkets Maven" }
    maven("https://maven.blamejared.com/") { name = "JEI Maven" }
}

dependencies {
    minecraft("com.mojang:minecraft:${project.property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${project.property("yarn_mappings")}:v2")
    // Impl
    modImplementation("net.fabricmc:fabric-loader:${project.property("loader_version")}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${project.property("kotlin_loader_version")}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.property("fabric_version")}")
    modImplementation("dev.emi:trinkets:${project.property("trinkets_version")}")
    // Runtime
    modRuntimeOnly("com.terraformersmc:modmenu:${project.property("modmenu_version")}")
    modRuntimeOnly("mezz.jei:jei-${project.property("minecraft_version")}-fabric:${project.property("jei_version")}")
}

tasks.processResources {
    inputs.property("version", project.version)
    inputs.property("minecraft_version", project.property("minecraft_version"))
    inputs.property("loader_version", project.property("loader_version"))
    filteringCharset = "UTF-8"

    filesMatching("fabric.mod.json") {
        expand(
            "version" to project.version, "minecraft_version" to project.property("minecraft_version"), "loader_version" to project.property("loader_version"),
            "kotlin_loader_version" to project.property("kotlin_loader_version")
        )
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.release.set(targetJavaVersion)
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(targetJavaVersion.toString()))
}

tasks.jar {
    from("LICENSE") {
        rename { "${it}_${project.base.archivesName}" }
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = project.property("archives_base_name") as String
            from(components["java"])
        }
    }

    repositories {}
}