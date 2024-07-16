//package org.example.demo.app.noti
//
//import org.example.demo.app.noti.sms.NotificationSms
//import kotlin.reflect.KClass
//
//enum class NotificationType (
//    private val clazz: KClass<out NotificationAction<*>>,
//) {
//    SMS(NotificationSms::class),
//    ;
//
//    fun isSupport(action: NotificationAction<*>):Boolean {
//        return this.clazz == action::class
//    }
//}
