package observer_pattern.observables

import NotificationAlertObserver

interface ProductStockObservable {
    fun addObserverUser( notificationAlertObserver: NotificationAlertObserver)
    fun removeObserverUser( notificationAlertObserver: NotificationAlertObserver)
    fun notifySubscribers()
    fun setStockCount(newStockCount: Int)
    fun getCurrentStockCount() : String
}