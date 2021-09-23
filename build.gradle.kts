// We're developing for Java
plugins {
    java
}

// The main package name
group = "shattered.software"
// Using semver instead of SNAPSHOT versioning
version = "1.0.0"

// Places we can get libraries
repositories {
    // Use local versions first
    mavenLocal()
    // Look in Spigot's repos next
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    // Look in Maven Central last
    mavenCentral()
}

// Libraries we need
dependencies {
    // We want Spigot
    implementation("org.spigotmc:spigot-api:1.17-R0.1-SNAPSHOT")
}
