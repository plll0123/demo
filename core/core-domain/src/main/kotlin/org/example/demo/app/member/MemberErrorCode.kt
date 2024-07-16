package org.example.demo.app.member

import org.example.demo.error.ErrorCode

enum class MemberErrorCode(
    override val message: String
) : ErrorCode {

    NOT_EXIST_MEMBER("회원이 존재하지 않습니다.");
}