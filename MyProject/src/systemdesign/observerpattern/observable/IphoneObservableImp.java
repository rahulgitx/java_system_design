package systemdesign.observerpattern.observable;

import systemdesign.observerpattern.observor.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImp implements StocksObservable{
    private List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }



    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        stockCount = newStock;
        if(stockCount > 0){
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
