package main.java.StructuralPatterns.compositepattern.parkinglot;

import java.util.*;

public class Floor {

    private static final int TRUCK_SLOT_COUNT = 1;
    private static final int BIKE_SLOT_COUNT = 2;
    private int id;
    private Slot[] slots;
    private final int numOfSlots;
    private Map<VehicleType, Integer> slotCount;

    private Map<VehicleType, Integer> firstFreeSlot;
    public Floor(int id, int numOfSlot) {
        this.id = id;
        this.numOfSlots = numOfSlot;
        this.slotCount = new HashMap<>();
        this.firstFreeSlot  = new HashMap<>();
        slots = new Slot[numOfSlot];
        init();
    }

    private void init(){

        slotCount.put(VehicleType.TRUCK, TRUCK_SLOT_COUNT);
        slotCount.put(VehicleType.BIKE, BIKE_SLOT_COUNT);
        slotCount.put(VehicleType.CAR, numOfSlots-(TRUCK_SLOT_COUNT+BIKE_SLOT_COUNT));

        firstFreeSlot.put(VehicleType.TRUCK, 1 );
        firstFreeSlot.put(VehicleType.BIKE, TRUCK_SLOT_COUNT+1 );
        firstFreeSlot.put(VehicleType.CAR, TRUCK_SLOT_COUNT+BIKE_SLOT_COUNT+1 );

        for(int temp = 1; temp <= numOfSlots ; temp++){
            if(temp <=TRUCK_SLOT_COUNT){
                Slot slot = new Slot(VehicleType.TRUCK, false, temp);
                slots[temp-1] = slot;
            }
            else if(temp <= TRUCK_SLOT_COUNT + BIKE_SLOT_COUNT){
                Slot slot = new Slot(VehicleType.BIKE, false, temp);
                slots[temp-1] = slot;
            }
            else{
                Slot slot = new Slot(VehicleType.CAR, false, temp);
                slots[temp-1] = slot;
            }
        }
    }

    public void displayNumOfFreeSlots(VehicleType slotType){
        System.out.println("Num of free slots for " + slotType + " on Floor " + id +":" +
                slotCount.get(slotType));
    }

    public void displayFreeSlots(VehicleType slotType){
        System.out.println("Free slots for " + slotType + " on Floor " + id +":");
        for(int temp = 0; temp < numOfSlots; temp++){
            if(slots[temp].getSlotType() == slotType && !slots[temp].isOccupied()){
                System.out.print(slots[temp].getId() + "  ");
            }
        }
    }

    public void displayOccupiedSlots(VehicleType slotType){
        System.out.println("Occupied slots for " + slotType + " on Floor " + id +":");
        for(int temp = 0; temp < numOfSlots; temp++){
            if(slots[temp].getSlotType() == slotType && slots[temp].isOccupied()){
                System.out.print(slots[temp].getId() + "  ");
            }
        }
    }

    public Slot getSlotById(int id){
        return slots[id-1];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<VehicleType, Integer> getSlotCount() {
        return slotCount;
    }

    public void setSlotCount(VehicleType vehicleType, int value) {
        this.slotCount.put(vehicleType, value);
    }

    public Map<VehicleType, Integer> getFirstFreeSlot() {
        return firstFreeSlot;
    }

    public void updateFirstFreeSlot(VehicleType vehicleType, int value) {
        if(firstFreeSlot.get(vehicleType) == null || value < firstFreeSlot.get(vehicleType)){
            firstFreeSlot.put(vehicleType,value);
        }
    }

    public void setFirstFreeSlot(VehicleType vehicleType) {
        for(int temp = 0; temp < numOfSlots; temp++){
            if(slots[temp].getSlotType() == vehicleType && !slots[temp].isOccupied()){
                this.firstFreeSlot.put(vehicleType,temp+1);
                return;
            }
        }
        this.firstFreeSlot.put(vehicleType, null);
    }
}
