package org.example.demo.app.member

interface MemberRepository {

    fun save(member: Member): Member

//    fun update(id: Long, attributeValue: String, fieldType: MemberUpdatableAttribute)

}