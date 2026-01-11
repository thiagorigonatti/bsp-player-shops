plugins {
    id("java")
}

group = "me.thiagorigonatti"
version = "0.0.1-RESCUED"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/public/")
}

dependencies {
    implementation("org.spigotmc:spigot-api:1.21.11-R0.1-SNAPSHOT:shaded@jar")
    implementation(files("lib/BossShopPro-0.0.1-RESCUED.jar"))
}

tasks {
    named<Jar>("jar") {
        archiveBaseName.set("BSP-PlayerShops")
        archiveVersion.set("$version")
    }
}

tasks {
    processResources {
        filesMatching("plugin.yml") {
            expand("version" to project.version)
        }
    }
}