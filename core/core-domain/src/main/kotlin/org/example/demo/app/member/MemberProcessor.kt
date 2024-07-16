package org.example.demo.app.member

import org.example.demo.app.device.Device
import org.springframework.stereotype.Component

@Component
class MemberProcessor(
//    private val memberRepository: MemberRepository,
) {

    fun signUp(signupData: SignupData): Long {
        val member = signupData.toDomain()
//        return memberRepository.save(member).id
        return 0L
    }
}