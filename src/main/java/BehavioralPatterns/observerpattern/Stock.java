package observerpattern;

import observerpattern.observable.IpadObservable;
import observerpattern.observable.IphoneStockObservable;
import observerpattern.observable.StockObservable;

public class Stock {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        StockObservable ipadObservable = new IpadObservable();
        ipadObservable.addObserver(new MobileObserver("7051231232"));
        iphoneStockObservable.addObserver(new MobileObserver("1234567890"));
        ipadObservable.addObserver(new WebObserver("abc@gmail.com"));
        iphoneStockObservable.addObserver(new WebObserver("asd@gmail.com"));

        ipadObservable.setStock(20);
        iphoneStockObservable.setStock(100);
    }
}
