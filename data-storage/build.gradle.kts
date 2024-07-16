plugins {
    id("org.example.spring")
    kotlin("plugin.jpa")
}
//
//noArg {
//    invokeInitializers = true
//}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(project(":core:core-domain"))
    runtimeOnly("com.h2database:h2")
}