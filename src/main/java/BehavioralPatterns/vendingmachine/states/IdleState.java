package main.java.BehavioralPatterns.vendingmachine.states;

import main.java.BehavioralPatterns.vendingmachine.Coin;
import main.java.BehavioralPatterns.vendingmachine.Item;
import main.java.BehavioralPatterns.vendingmachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Vending Machine currently in Idle state");
    }
    public IdleState(VendingMachine vendingMachine){
        System.out.println("Vending Machine currently in Idle state");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new RuntimeException("We cannot insert coin in Idle State");
    }

    @Override
    public void clickOnSelectItemButton(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot click on select item in Idle State");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new RuntimeException("We cannot select item in Idle State");
    }

    @Override
    public int getChange(int extraAmount) throws Exception {
        throw new RuntimeException("we cannot get change in Idle state");
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot get refund when in Idle State");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new RuntimeException("We cannot insert coin in Idle State");
    }
}
