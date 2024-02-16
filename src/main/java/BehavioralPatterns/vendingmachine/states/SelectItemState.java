package main.java.BehavioralPatterns.vendingmachine.states;

import main.java.BehavioralPatterns.vendingmachine.Coin;
import main.java.BehavioralPatterns.vendingmachine.Item;
import main.java.BehavioralPatterns.vendingmachine.VendingMachine;

import java.util.List;

public class SelectItemState implements State{
    public SelectItemState(){
        System.out.println("Vending machine is currently in Select Item State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot click on Insert coin button when in Select Item State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new RuntimeException("We cannot when insert coins when in Select Item State");
    }

    @Override
    public void clickOnSelectItemButton(VendingMachine vendingMachine) throws Exception {
        throw new RuntimeException("We cannot click on select item button when in Select Item State");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int codeNumber) throws Exception {
        Item item = vendingMachine.getInventory().getItem(codeNumber);

        int pricePaidByClient = vendingMachine.getTotalAmount();

        if(pricePaidByClient < item.getPrice()){
            System.out.println("Insufficient amount, Price of item is:" + item.getPrice() +
                    "and you paid:" + pricePaidByClient);
            fullRefund(vendingMachine);
            throw new RuntimeException("Insufficient fund");
        }
        if(pricePaidByClient >= item.getPrice()){
            getChange(pricePaidByClient- item.getPrice());
        }
        vendingMachine.setMachineState(new DispenseState(vendingMachine, codeNumber));
    }

    @Override
    public int getChange(int extraAmount) throws Exception {
        System.out.println("Extra amount paid  for the item is refunded in the money tray" + extraAmount);
        return extraAmount;
    }

    @Override
    public List<Coin> fullRefund(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunding full amount as transaction is not valid:" + vendingMachine.getTotalAmount());
        List<Coin> refund = vendingMachine.getCoinList();
        vendingMachine.setMachineState(new IdleState(vendingMachine));
        return refund;

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new RuntimeException("We cannot dispense Item when in Select Item State");
    }

}
