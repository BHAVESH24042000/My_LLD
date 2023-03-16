package observer_pattern.observables

import NotificationAlertObserver

class IphoneProductStockObservableImpl(
    private var currentStockInt: Int,
    private val observersList: MutableList<NotificationAlertObserver>
) : ProductStockObservable {

    override fun addObserverUser(notificationAlertObserver: NotificationAlertObserver) {
        observersList.add(notificationAlertObserver)
    }

    override fun removeObserverUser(notificationAlertObserver: NotificationAlertObserver) {
        observersList.remove(notificationAlertObserver)
    }

    override fun notifySubscribers() {
        for (obs in observersList) {
            obs.update()
        }
    }

    override fun setStockCount(newStockCount: Int) {
        currentStockInt = newStockCount
        if (currentStockInt > 0) {
            notifySubscribers()
        }
    }

    override fun getCurrentStockCount(): String {
        return "Current Stock is : " + currentStockInt.toString()
    }
}