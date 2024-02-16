package main.java.BehavioralPatterns.vendingmachine;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public final int value;
    Coin(int value) {
        this.value = value;
    }
}
