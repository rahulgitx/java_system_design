package systemdesign.observerpattern.observor;

import systemdesign.observerpattern.observable.StocksObservable;

import java.util.List;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private List<String> phNumbers;
    private StocksObservable observable;
    public MobileAlertObserverImpl(List<String> phNumbers, StocksObservable stocksObservable){
        this.phNumbers = phNumbers;
        this.observable = stocksObservable;
    }

    @Override
    public void update() {
        for (String numbers : phNumbers) {
            sendEmail(numbers);
        }
    }

    void sendEmail(String number) {
        System.out.println("Sending sms to " + number + " that the count of stock is now " + observable.getStockCount() + " !!");
    }

}
