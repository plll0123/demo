package org.example.demo.error

interface ErrorCode {

    val name: String
    val message: String
    val code: String
        get() = name
}