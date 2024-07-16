plugins {
    id("org.example.kotlin")
    id("io.spring.dependency-management")
    id("org.springframework.boot")
    kotlin("plugin.noarg")
    kotlin("plugin.allopen")
    kotlin("plugin.spring")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // retrofit

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}