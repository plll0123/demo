package org.example.demo.app.noti.sms

data class SmsData(
    val memberId: Long,
    val phoneNumber: String,
    val title: String,
    val content: String,
)