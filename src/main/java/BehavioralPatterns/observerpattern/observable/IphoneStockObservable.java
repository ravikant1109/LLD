package main.java.BehavioralPatterns.observerpattern.observable;

import main.java.BehavioralPatterns.observerpattern.Observers;

import java.util.ArrayList;
import java.util.List;


public class IphoneStockObservable implements StockObservable {

    List<Observers> observersList;
    int quantity;

    String property;
    public IphoneStockObservable(){
        observersList = new ArrayList<Observers>();
        quantity = 0;
        property = "Iphone";
    }

    @Override
    public void addObserver(Observers obj) {
        observersList.add(obj);
    }

    @Override
    public void removeObserver(Observers obj) {
        observersList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(Observers obj: observersList){
            obj.update(property);
        }
    }

    @Override
    public void setStock(int quantity) {
        this.quantity = quantity;
        notifyObserver();
    }

    @Override
    public int getStock() {
        return this.quantity;
    }
}


