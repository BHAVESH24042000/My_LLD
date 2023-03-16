package observer_pattern.observers

import NotificationAlertObserver

class EmailAlertNotificationObserverImpl(private val emailId: String) : NotificationAlertObserver {

    override fun update() {
        println("mail notification , product in stock : mail sent to $emailId")
    }
}