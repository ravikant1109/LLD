package main.java.BehavioralPatterns.vendingmachine;

import main.java.BehavioralPatterns.vendingmachine.states.State;

public class Main {

        public static void main(String args[]){

            VendingMachine vendingMachine = new VendingMachine();
            try {

                System.out.println("|");
                System.out.println("filling up the inventory");
                System.out.println("|");

                fillUpInventory(vendingMachine);
                displayInventory(vendingMachine);

                System.out.println("|");
                System.out.println("clicking on InsertCoinButton");
                System.out.println("|");

                State vendingState = vendingMachine.getMachineState();
                vendingState.getChange(100);
                vendingState.clickOnInsertCoinButton(vendingMachine);

                vendingState = vendingMachine.getMachineState();
                vendingState.insertCoin(vendingMachine, Coin.PENNY);
//                vendingState.insertCoin(vendingMachine, Coin.QUARTER);
                // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

                System.out.println("|");
                System.out.println("clicking on ProductSelectionButton");
                System.out.println("|");
                vendingState.clickOnSelectItemButton(vendingMachine);

                vendingState = vendingMachine.getMachineState();
                vendingState.selectItem(vendingMachine, 102);

                displayInventory(vendingMachine);

            }
            catch (Exception e){
                System.out.println("Exception: " + e.getMessage());
                displayInventory(vendingMachine);
            }


        }

        private static void fillUpInventory(VendingMachine vendingMachine){
            ItemShelf[] slots = vendingMachine.getInventory().getInventory();
            for (int i = 0; i < slots.length; i++) {
                Item newItem = new Item();
                if(i<3) {
                    newItem.setItemType(ItemType.COKE);
                    newItem.setPrice(12);
                }else if(i<5){
                    newItem.setItemType(ItemType.PEPSI);
                    newItem.setPrice(9);
                }else if(i<7){
                    newItem.setItemType(ItemType.WATER);
                    newItem.setPrice(13);
                }else if(i<10){
                    newItem.setItemType(ItemType.SODA);
                    newItem.setPrice(7);
                }
                slots[i].setItem(newItem);
                slots[i].setSoldOut(false);
            }
        }

        private static void displayInventory(VendingMachine vendingMachine){

            ItemShelf[] slots = vendingMachine.getInventory().getInventory();
            for (int i = 0; i < slots.length; i++) {

                System.out.println("CodeNumber: " + slots[i].getCode() +
                        " Item: " + slots[i].getItem().getItemType().name() +
                        " Price: " + slots[i].getItem().getPrice() +
                        " isAvailable: " + !slots[i].isSoldOut());
            }
        }
}
