//package org.example.demo.entity
//
//import org.example.demo.app.device.DeviceRepository
//import org.springframework.stereotype.Repository
//
//@Repository
//class DeviceCoreRepository(
//    private val deviceJpaRepository: DeviceJpaRepository
//) : DeviceRepository {
//
//    override fun findByMemberId(memberId: Long): List<DeviceEntity> {
//        return deviceJpaRepository.findByMemberId(memberId)
//    }
//}