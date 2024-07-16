plugins {
    id("org.example.spring")
}

dependencies {
    implementation(project(":client"))
    implementation("org.springframework.security:spring-security-crypto")
    implementation("org.springframework:spring-tx")
}