//package org.example.demo.app.noti.alarm
//
//import org.example.demo.app.member.MemberReader
//import org.example.demo.app.noti.NotificationAction
//import org.springframework.stereotype.Component
//
//@Component
//class NotificationAlarmSender(
//    private val memberReader: MemberReader,
////    private val alarmRepository: AlarmRepository,
//) : NotificationAction<AlarmData> {
//
//    override fun action(data: AlarmData) {
//        val sender = memberReader.getById(data.senderId)
//        val receiver = memberReader.getById(data.receiverId)
////        val alarm = Alarm(
////            sender = sender,
////            receiver = receiver
////        )
////        alarmRepository.save(alarm)
//    }
//}