package main.java.BehavioralPatterns.vendingmachine.states;

import main.java.BehavioralPatterns.vendingmachine.Coin;
import main.java.BehavioralPatterns.vendingmachine.Item;
import main.java.BehavioralPatterns.vendingmachine.ItemShelf;
import main.java.BehavioralPatterns.vendingmachine.VendingMachine;

import java.util.List;

public class DispenseState implements State{

    public DispenseState(VendingMachine vendingMachine, int code) throws Exception {
        System.out.println("Vending Machine is in Dispense State");
        dispenseProduct(vendingMachine, code);
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot click on Insert coin button when in Dispense Item State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new RuntimeException("We cannot Insert coin button when in Dispense Item State");
    }

    @Override
    public void clickOnSelectItemButton(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot click on select item button when in Dispense Item State");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new RuntimeException("We cannot select item when in Dispense Item State");
    }

    @Override
    public int getChange(int extraAmount) throws Exception {
        throw new RuntimeException("We cannot return change when in Dispense Item State");
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot refund money when in Dispense Item State");

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Item has been dispatched");
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setMachineState(new IdleState());
        return item;
    }
}
