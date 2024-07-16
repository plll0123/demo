package org.example.demo.entity

import jakarta.persistence.*
import org.example.demo.app.member.Member

@Entity
class MemberEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    var email: String,
    var password: String,
    var nickname: String,
    var phoneNumber: String,
    var profileImageUrl: String,
) {
    fun toDomain(): Member {
        return Member(
            id = id,
            email = email,
            password = password,
            nickname = nickname,
            phoneNumber = phoneNumber,
            profileImageUrl = profileImageUrl
        )
    }

    fun update(
        nickname: String = this.nickname,
        password: String = this.password,
        phoneNumber: String = this.phoneNumber,
        profileImageUrl: String = this.profileImageUrl
    ) {
        this.nickname = nickname
        this.password = password
        this.phoneNumber = phoneNumber
        this.profileImageUrl = profileImageUrl
    }
}