package org.example.demo.entity

import org.example.demo.app.member.Member
import org.example.demo.app.member.MemberRepository
import org.springframework.data.jpa.repository.JpaRepository

interface MemberCoreRepository : JpaRepository<MemberEntity, Long>, MemberRepository {
//
//    fun findById(id: Long): MemberEntity {
//        return memberJpaRepository.findById(id)
//            .orElseThrow()
//    }

    override fun save(member: Member): Member {
        val memberEntity = MemberEntity(
            nickname = member.nickname,
            password = member.password,
            phoneNumber = member.phoneNumber,
            email = member.email,
            profileImageUrl = member.profileImageUrl
        )
        return save(memberEntity)
            .toDomain()
    }

}