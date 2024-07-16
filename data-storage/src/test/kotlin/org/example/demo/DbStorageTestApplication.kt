package org.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbStorageTestApplication

fun main(args: Array<String>) {
    runApplication<DbStorageTestApplication>(*args)
}