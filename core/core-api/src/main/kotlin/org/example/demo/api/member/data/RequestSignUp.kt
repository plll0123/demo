package org.example.demo.api.member.data

import org.example.demo.app.member.Member

data class RequestSignUp(
    val nickname: String,
    val password: String,
    val phone: String,
) {

//    fun toMember(): Member {
//        return Member(
//            nickname = nickname,
//            password = password,
//            phoneNumber = phone
//        )
//    }
}