package systemdesign.observerpattern.observor;

import systemdesign.observerpattern.observable.StocksObservable;

import java.util.List;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private List<String> emails;
    private StocksObservable observable;
    public EmailAlertObserverImpl(List<String> emails, StocksObservable stocksObservable){
        this.emails = emails;
        this.observable = stocksObservable;
    }
    @Override
    public void update() {
        for(String email : emails){
            sendEmail(email);
        }
    }

    void sendEmail(String email){
        System.out.println("Sending email to " + email + " that the count of stock is now " + observable.getStockCount() + " !!");
    }
}
