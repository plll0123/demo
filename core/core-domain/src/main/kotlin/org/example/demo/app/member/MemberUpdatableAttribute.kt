package org.example.demo.app.member

enum class MemberUpdatableAttribute(
//    val apply: (member: Member, value: String) -> Member,
) {

    NICKNAME
//        ({ member, value -> member.updateInfo(nickname = value) })
    ,
    PASSWORD
//      /**/  ({ member, value -> member.updateInfo(password = value) })
    ,
    PHONE_NUMBER
//        ({ member, value -> member.updateInfo(phoneNumber = value) })
    ,
    ;
}