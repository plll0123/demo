//package org.example.demo.entity
//
//import org.example.demo.app.noti.alarm.Alarm
//import org.example.demo.app.noti.alarm.AlarmRepository
//import org.springframework.stereotype.Repository
//
//@Repository
//class AlarmCoreRepository(
//    private val alarmJpaRepository: AlarmEntityJpaRepository,
//) : AlarmRepository {
//
//    override fun save(alarm: Alarm) {
//        val alarmEntity = AlarmEntity.of(alarm)
//        alarmJpaRepository.save(alarmEntity)
//    }
//
//    override fun findBySenderId(senderId: Long): List<Alarm> {
//        return alarmJpaRepository.findBySenderId(senderId)
//            .map { it.toDomain() }
//    }
//}