package main.java.BehavioralPatterns.vendingmachine.states;

import main.java.BehavioralPatterns.vendingmachine.Coin;
import main.java.BehavioralPatterns.vendingmachine.Item;
import main.java.BehavioralPatterns.vendingmachine.VendingMachine;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void clickOnSelectItemButton(VendingMachine vendingMachine) throws Exception;

    public void selectItem(VendingMachine vendingMachine, int codeNumber) throws Exception;

    public int getChange(int extraAmount) throws Exception;

    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;

}
