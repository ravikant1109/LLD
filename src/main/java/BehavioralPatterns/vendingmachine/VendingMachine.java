package main.java.BehavioralPatterns.vendingmachine;

import main.java.BehavioralPatterns.vendingmachine.states.IdleState;
import main.java.BehavioralPatterns.vendingmachine.states.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    State machineState;
    List<Coin> coinList;
    Inventory inventory;

    public VendingMachine(){
        machineState = new IdleState();
        coinList = new ArrayList<>();
        inventory = new Inventory(10);
    }

    public State getMachineState() {
        return machineState;
    }

    public void setMachineState(State machineState) {
        this.machineState = machineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getTotalAmount(){
        int amount = 0;
        for(Coin coin: coinList){
            amount = amount + coin.value;
        }
        return amount;
    }

}
