package org.example.demo.app.member

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class MemberService(
//    private val memberProcessor: MemberProcessor,
) {
    val passwordEncoder: PasswordEncoder = BCryptPasswordEncoder()

    fun signUp(signupData: SignupData): Long {


        TODO()
    }

}