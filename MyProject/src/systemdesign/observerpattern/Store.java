package systemdesign.observerpattern;

import systemdesign.observerpattern.observable.IphoneObservableImp;
import systemdesign.observerpattern.observable.StocksObservable;
import systemdesign.observerpattern.observor.EmailAlertObserverImpl;
import systemdesign.observerpattern.observor.MobileAlertObserverImpl;
import systemdesign.observerpattern.observor.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneObservableImp();
        List<String> emails = new ArrayList<>();
        emails.add("abc@gmail.com"); emails.add("adfs@yahoo.com");

        List<String> phNumbers = new ArrayList<>();
        phNumbers.add("1234567"); phNumbers.add("532345323");

        NotificationAlertObserver emailAlertObserver = new EmailAlertObserverImpl(emails, stocksObservable);
        NotificationAlertObserver mobileAlertObserver = new MobileAlertObserverImpl(phNumbers, stocksObservable);

        stocksObservable.add(emailAlertObserver);
        stocksObservable.add(mobileAlertObserver);

        stocksObservable.setStockCount(10);


    }
}
