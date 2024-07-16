//package org.example.demo.app.noti.sms
//
//import org.example.demo.app.member.MemberReader
//import org.example.demo.app.member.MemberRepository
//import org.example.demo.app.noti.NotificationAction
//import org.springframework.stereotype.Component
//
//@Component
//class NotificationSms(
//    private val memberReader: MemberReader,
//    private val smsSender: SmsSender,
//) : NotificationAction<SmsData> {
//
//    override fun action(data: SmsData) {
//        val (memberId: Long, message: String) = data
//        val member = memberReader.getById(memberId)
//        smsSender.send(
//            member.phoneNumber.toString(),
//            message
//        )
//    }
//}