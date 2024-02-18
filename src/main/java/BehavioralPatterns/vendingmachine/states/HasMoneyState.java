package main.java.BehavioralPatterns.vendingmachine.states;

import main.java.BehavioralPatterns.vendingmachine.Coin;
import main.java.BehavioralPatterns.vendingmachine.Item;
import main.java.BehavioralPatterns.vendingmachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{

    public HasMoneyState(){
        System.out.println("Vending machine is currently in Has Money State");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accepted the coin:" + coin);
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void clickOnSelectItemButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setMachineState(new SelectItemState());
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new RuntimeException("We cannot select item when in Has Money State");
    }

    @Override
    public int getChange(int extraAmount) throws Exception {
        throw new RuntimeException("We cannot refund change amount when in Has Money State");
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        List<Coin> refund = vendingMachine.getCoinList();
        System.out.println("Returning full amount in money tray" + vendingMachine.getTotalAmount());
        vendingMachine.setMachineState(new IdleState());
        return refund;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new RuntimeException("We cannot dispense item when in Has Money State");
    }
}
