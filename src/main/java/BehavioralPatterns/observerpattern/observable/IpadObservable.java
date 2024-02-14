package main.java.BehavioralPatterns.observerpattern.observable;

import main.java.BehavioralPatterns.observerpattern.Observers;

import java.util.ArrayList;
import java.util.List;

public class IpadObservable implements StockObservable{

    List<Observers> observersList;
    int quantity;
    String property;

    public IpadObservable(){
        observersList = new ArrayList<Observers>();
        this.quantity = 0;
        this.property = "Ipad";
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
        for(Observers obj : observersList){
            obj.update(property);
        }

    }

    @Override
    public void setStock(int stock) {
        this.quantity = stock;
        notifyObserver();

    }

    @Override
    public int getStock() {
        return quantity;
    }
}
