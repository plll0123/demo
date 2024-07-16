//package org.example.demo.app.device
//
//import org.springframework.stereotype.Component
//import org.springframework.transaction.annotation.Transactional
//
//@Component
//class DeviceAppender(
//    private val deviceRepository: DeviceRepository,
//) {
//
//    @Transactional
//    fun append(device: Device) {
//        val deviceEntities = deviceRepository.findByMemberId(device.memberId)
//        val found = deviceEntities.find { it.deviceInfo == device.deviceInfo }
//        if (found != null) {
//            found.deviceInfo = device.deviceInfo
//            return
//        }
//        if (deviceEntities.size == 3) {
//            deviceEntities.minByOrNull { it.id }
//                ?.let { deviceRepository.delete(it) }
//        }
//        deviceRepository.save(device)
//    }
//
//}
