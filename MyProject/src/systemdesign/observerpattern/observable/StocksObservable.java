package systemdesign.observerpattern.observable;

import systemdesign.observerpattern.observor.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStock);
    public int getStockCount();
}
