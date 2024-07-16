package org.example.demo.api.common

class ApiResponse<T> private constructor(
    data: T,
) {
    companion object {
        fun <T> success(data: T) = ApiResponse(data)
    }
}