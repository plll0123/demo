package org.example.demo.app.noti.sms

import org.springframework.stereotype.Component

@Component
class SmsSender {

    fun send(target: String, message: String) {
        println("$target 회원님! '$message'라는 메세지가 도착헀어요!")
    }
}