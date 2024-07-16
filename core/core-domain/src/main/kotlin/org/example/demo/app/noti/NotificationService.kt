//package org.example.demo.app.noti
//
//import org.springframework.stereotype.Component
//
//@Component
//class NotificationService<T>(
//    private val notiServices: List<NotificationAction<T>>,
//) {
//
//    fun send(type: NotificationType, data: T) {
//        notiServices.first { type.isSupport(it) }
//            .action(data)
//    }
//}
