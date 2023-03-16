package observer_pattern.observers

import NotificationAlertObserver

class MobileAlertNotificationObserverImpl(private val phoneNumber: String) : NotificationAlertObserver {

    override fun update() {
        println("Text Message notification , product in stock : mail sent to $phoneNumber")
    }
}