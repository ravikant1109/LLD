package main.java.StructuralPatterns.compositepattern.parkinglot;

import java.util.*;

public class ParkingLot {

    private static final String ID = "PR1234";
    private static final String FREE_COUNT = "free_count";
    private static final String FREE_SLOTS = "free_slots";
    private static final String OCCUPIED_SLOTS = "occupied_slots";
    private Floor[] floors;

    private final int numberOfFloors;
    private final int floorCapacity;
    public ParkingLot(int numOfFloors, int floorCapacity){
        this.numberOfFloors = numOfFloors;
        this.floorCapacity = floorCapacity;
        floors = new Floor[numOfFloors];
        initializeParkingLot();
    }

    private void initializeParkingLot(){
        for(int temp = 1; temp <= numberOfFloors; temp++){
            Floor floor = new Floor(temp, floorCapacity);
            floors[temp-1] = floor;
        }
    }

    public void display(String displayCommand, VehicleType slotType){
        switch (displayCommand){
            case FREE_COUNT -> {
                for (int temp = 0; temp<numberOfFloors; temp++){
                    floors[temp].displayNumOfFreeSlots(slotType);

                }
            }
            case FREE_SLOTS -> {
                for (int temp = 0; temp<numberOfFloors; temp++){
                    floors[temp].displayFreeSlots(slotType);
                    System.out.println("\n");
                }
            }
            case OCCUPIED_SLOTS -> {
                for (int temp = 0; temp<numberOfFloors; temp++){
                    floors[temp].displayOccupiedSlots(slotType);
                    System.out.println("\n");
                }
            }
        }
    }



    public void parkVehicle(VehicleType vehicleType, String regNo, String color){

        Vehicle vehicle = null;
        for(int temp=0; temp<numberOfFloors;temp++){
            if (floors[temp].getSlotCount().get(vehicleType) != 0){
                vehicle = new Vehicle(vehicleType, regNo, color);
                Slot slot = floors[temp].getSlotById(floors[temp].getFirstFreeSlot().get(vehicleType));
                slot.setOccupied(true);
                slot.setVehicle(vehicle);
                slot.setTicket(ID+"_"+floors[temp].getId()+"_"+slot.getId());
                floors[temp].setSlotCount(vehicleType,
                        floors[temp].getSlotCount().get(vehicleType)-1);
                floors[temp].setFirstFreeSlot(vehicleType);
                System.out.println("Parked Vehicle: Ticket ID :" + slot.getTicket());
                break;
            }
        }

        if(vehicle==null){
            System.out.println("Parking lot is FULL!!");
        }

    }

    public void unparkVehicle(String ticket){
        String[] ids = ticket.split("_");
        int floor = Integer.parseInt(ids[1]) - 1;
        int slotNum = Integer.parseInt(ids[2]);
        Slot slot =  floors[floor].getSlotById(slotNum);
        if(!Objects.equals(slot.getTicket(), ticket)){
            System.out.println("Invalid Ticket!!");
            return;
        }
        System.out.println("UnParked Vehicle with reg no:" + slot.getVehicle().getRegNumber()
        + " and color:"+ slot.getVehicle().getColor());
        floors[floor].updateFirstFreeSlot(slot.getSlotType(),slotNum);
        floors[floor].setSlotCount(slot.getSlotType(),
                floors[floor].getSlotCount().get(slot.getSlotType())+1);
        slot.setOccupied(false);
        slot.setVehicle(null);
        slot.setTicket(null);

    }
}
