//package org.example.demo.entity
//
//import jakarta.persistence.*
//import org.example.demo.app.noti.alarm.Alarm
//
//@Entity
//class AlarmEntity(
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long = 0L,
//    val senderId: Long,
//    val receiverId: Long,
//) {
//    fun toDomain(): Alarm {
//        return Alarm(
//            id = this.id,
//            sender = senderId,
//            receiver = receiverId
//        )
//    }
//}