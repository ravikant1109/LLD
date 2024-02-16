package main.java.BehavioralPatterns.vendingmachine;

public class ItemShelf {
    private Item item;
    private int code;
    private boolean isSoldOut;

    public Item getItem() {
        return item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
