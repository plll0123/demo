//package org.example.demo.app.device
//
//import org.springframework.stereotype.Service
//
//@Service
//class DeviceService(
//    private val deviceAppender: DeviceAppender,
//    private val deviceReader: DeviceReader,
//) {
//
//    fun read(memberId: Long): List<Device> {
//        return deviceReader.readByMemberId(memberId)
//    }
//
//    fun append(device: Device) {
//        deviceAppender.append(device)
//    }
//
//}