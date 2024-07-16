package org.example.demo.app.noti

interface NotificationAction<T> {

    fun action(data: T)
}