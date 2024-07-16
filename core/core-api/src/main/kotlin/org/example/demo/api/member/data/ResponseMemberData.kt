package org.example.demo.api.member.data

import org.example.demo.app.member.Member

data class ResponseMemberData(
    val memberId: Long,
    val nickname: String,
    val phoneNumber: String,
) {

    companion object {
        fun from(member: Member): ResponseMemberData {
            return ResponseMemberData(
                memberId = member.id,
                nickname = member.nickname,
                phoneNumber = member.phoneNumber,
            )
        }
    }
}