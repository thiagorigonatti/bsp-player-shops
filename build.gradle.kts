plugins {
    id("java")
}

group = "br.com.thecoders"
version = "5.0.1"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21.4-R0.1-20250202.041845-31")
    compileOnly(files("lib/BossShopPro.jar"))
}


tasks {
    processResources{
        from(sourceSets.main.get().resources.srcDirs) {
            filesMatching("plugin.yml") {
                expand("version" to version)
            }
        }
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}

tasks.withType<Jar> {
    archiveFileName.set("BSP-PlayerShops.jar")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}