plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
    implementation("org.jetbrains.kotlin:kotlin-allopen:1.9.24")
    implementation("org.jetbrains.kotlin:kotlin-noarg:1.9.24")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.24")

    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.1")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.1.5")
}
