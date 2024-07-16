package org.example.demo.app.member

import org.example.demo.app.device.Device

data class Member(
    val id: Long = 0L,
    val email: String,
    val password: String,
    val nickname: String,
    val phoneNumber: String,
    val profileImageUrl: String,
    val devices: List<Device> = listOf()
)