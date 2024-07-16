package org.example.demo.jwt

import org.example.demo.app.member.MemberReader
import org.example.demo.app.member.MemberRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class UserDetailsServiceImpl(
    private val memberReader: MemberReader,
    private val passwordEncoder: PasswordEncoder,
) : UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        if (username == null) {
            throw IllegalArgumentException()
        }
        val member = memberReader.getById(username.toLong())
        return UserInfo(member)
    }
}