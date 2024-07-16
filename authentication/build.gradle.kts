plugins {
    id("org.example.spring")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation(project(":core:core-domain"))
    implementation("org.apache.tomcat.embed:tomcat-embed-core")
}

tasks.getByName("jar") {
    enabled = true
}

tasks.getByName("bootJar"){
    enabled = false
}