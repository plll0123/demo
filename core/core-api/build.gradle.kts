plugins {
    id("org.example.spring")
}

dependencies {
    implementation(project(":core:core-domain"))
    implementation(project(":client"))
    implementation(project(":web"))
    implementation(project(":data-storage"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName("jar") {
    enabled = false
}

tasks.getByName("bootJar") {
    enabled = true
}
