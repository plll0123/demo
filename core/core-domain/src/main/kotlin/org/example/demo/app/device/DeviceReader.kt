//package org.example.demo.app.device
//
//import org.example.demo.entity.MemberJpaRepository
//import org.springframework.stereotype.Component
//import org.springframework.transaction.annotation.Transactional
//
//@Component
//class DeviceReader(
//    private val deviceRepository: DeviceRepository,
//) {
//
//    fun readByMemberId(memberId: Long): List<Device> {
//        return deviceRepository
//            .findByMemberId(memberId)
//            .map { it.toDomain() }
//    }
//
//}
