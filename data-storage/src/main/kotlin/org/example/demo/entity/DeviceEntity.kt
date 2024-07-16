//package org.example.demo.entity
//
//import jakarta.persistence.Entity
//import jakarta.persistence.GeneratedValue
//import jakarta.persistence.GenerationType
//import jakarta.persistence.Id
//import org.example.demo.app.device.Device
//
//@Entity
//class DeviceEntity(
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long = 0,
//    val memberId: Long,
//    val uid: String,
//    val pushToken: String,
//    var deviceInfo: String
//) {
//    fun toDomain(): Device {
//        return Device(id, memberId, uid, pushToken, deviceInfo)
//    }
//
//}