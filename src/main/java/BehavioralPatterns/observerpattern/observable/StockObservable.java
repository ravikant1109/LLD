package observerpattern.observable;

import observerpattern.Observers;

public interface StockObservable {

    public void addObserver(Observers obj);
    public void removeObserver(Observers obj);

    public void notifyObserver();

    public void setStock(int val);

    public int getStock();

}
