package org.example.demo

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication(
    @Value("\${hello}") private val port: String,
    @Value("\${db}") private val db: String,
) {

    @PostConstruct
    fun ehl() {
        println("port = ${port}")
        println("db = ${db}")
    }
}

fun main() {
    runApplication<DemoApplication>()
}