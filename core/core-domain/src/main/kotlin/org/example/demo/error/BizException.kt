package org.example.demo.error

class BizException(
    errorCode: ErrorCode,
    val code: String = errorCode.code
) : RuntimeException(errorCode.message)