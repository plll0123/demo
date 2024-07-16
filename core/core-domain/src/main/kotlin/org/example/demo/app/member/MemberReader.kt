//package org.example.demo.app.member
//
//import org.example.demo.app.paging.Page
//import org.example.demo.entity.MemberEntity
//import org.example.demo.error.BizException
//import org.springframework.stereotype.Component
//
//@Component
//class MemberReader(
//    private val memberRepository: MemberRepository,
//) {
//
//    fun getById(id: Long): Member {
//        val memberEntity: MemberEntity = memberRepository.findById(id)
//            ?: throw BizException(MemberErrorCode.NOT_EXIST_MEMBER)
//        return memberEntity.toDomain()
//    }
//
//}