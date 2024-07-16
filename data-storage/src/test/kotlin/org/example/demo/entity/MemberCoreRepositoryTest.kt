//package org.example.demo.entity
//
//import org.assertj.core.api.Assertions
//import org.assertj.core.api.Assertions.*
//import org.example.demo.DbStorageContextTest
//import org.example.demo.app.member.*
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.assertThrows
//import kotlin.test.assertNotNull
//import kotlin.test.assertTrue
//
//class MemberCoreRepositoryTest(
//    private val memberCoreRepository: MemberCoreRepository,
//) : DbStorageContextTest() {
//
//    @Test
//    fun `save 테스트`() {
//        val member = Member(
//            nickname = Nickname("tester"),
//            password = Password("password"),
//            phoneNumber = PhoneNumber("010-1234-1234"),
//        )
//        val saved = memberCoreRepository.save(member)
//        val found = memberCoreRepository.findById(saved.id)
//        with(found!!) {
//            assertTrue { nickname.value == "tester" }
//            assertTrue { password.value == "password" }
//            assertTrue { phoneNumber.value == "010-1234-1234" }
//        }
//    }
//
//    @Test
//    fun `update 테스트`() {
//        val member = Member(
//            nickname = Nickname("tester"),
//            password = Password("password"),
//            phoneNumber = PhoneNumber("010-1234-1234"),
//        )
//        val memberId = memberCoreRepository.save(member).id
//        memberCoreRepository.update(memberId, "newPassword", MemberUpdatableAttribute.PASSWORD)
//        val found = memberCoreRepository.findById(memberId)!!
//        with(found) {
//            assertThat(nickname.value).isEqualTo("tester")
//            assertThat(password.value).isEqualTo("newPassword")
//            assertThat(phoneNumber.value).isEqualTo("010-1234-1234")
//        }
//    }
//}