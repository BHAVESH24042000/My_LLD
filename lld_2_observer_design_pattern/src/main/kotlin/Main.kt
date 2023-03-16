import observer_pattern.observables.IphoneProductStockObservableImpl
import observer_pattern.observers.EmailAlertNotificationObserverImpl
import observer_pattern.observers.MobileAlertNotificationObserverImpl

fun main(args: Array<String>) {
    val list = mutableListOf<NotificationAlertObserver>()
    list.add(EmailAlertNotificationObserverImpl("bhaveshaggarwal20@gmail.com"))
    list.add(MobileAlertNotificationObserverImpl("8800648667"))

    val iphone  = IphoneProductStockObservableImpl(0, list)
    println(iphone.getCurrentStockCount())
    iphone.setStockCount(10)
    println(iphone.getCurrentStockCount())
    iphone.addObserverUser(EmailAlertNotificationObserverImpl("ansul@g.com"))
    iphone.setStockCount(0)
    println(iphone.getCurrentStockCount())
    iphone.setStockCount(20)
    println(iphone.getCurrentStockCount())


}