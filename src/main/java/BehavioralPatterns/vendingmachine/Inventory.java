package main.java.BehavioralPatterns.vendingmachine;

public class Inventory {
    ItemShelf[] inventory;

    public Inventory(int size){
        inventory = new ItemShelf[size];
        initialEmptyInventory(size);
    }

    private void initialEmptyInventory(int size){
        int startCode = 101;
        for ( int i = 0; i < size ; i++){
            ItemShelf item = new ItemShelf();
            item.setCode(startCode);
            item.setSoldOut(true);
            inventory[i] = item;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber){
        for(ItemShelf itemShelf: inventory){
            if(itemShelf.getCode() == codeNumber){
                if(itemShelf.isSoldOut()){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }
                else {
                    throw new RuntimeException("Item is already present in the shelf with code" +codeNumber+
                            "please try again");
                }
            }
        }
        throw new RuntimeException("Invalid code");
    }

    public Item getItem(int codeNumber){
        for (ItemShelf itemShelf: inventory){
            if(itemShelf.getCode() == codeNumber){
                if (itemShelf.isSoldOut()){
                    throw new RuntimeException("Item is sold out");
                }
                else{
                    return itemShelf.getItem();
                }
            }
        }
        throw new RuntimeException("Invalid Code");
    }



    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf: inventory){
            if (itemShelf.getCode() == codeNumber){
                itemShelf.setSoldOut(true);
            }
        }
    }


    public ItemShelf[] getInventory() {
        return inventory;
    }





    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }



}
