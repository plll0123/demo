package org.example.demo.app.member

import java.util.*

data class SignupData(
    val type: SignupType,
    val email: String,
    val password: String,
    val nickname: String = UUID.randomUUID().toString(),
    val phoneNumber: String,
    val profileImageUrl: String = "",
    val agreedTerms: List<Long> = listOf()
) {

    fun toDomain(
        nickname: String = this.nickname,
        profileImageUrl: String = this.profileImageUrl,
    ): Member {
        return Member(
            email = email,
            password = password,
            nickname = nickname,
            phoneNumber = phoneNumber,
            profileImageUrl = profileImageUrl
        )
    }
}