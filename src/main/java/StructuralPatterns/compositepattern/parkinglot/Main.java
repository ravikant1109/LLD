package main.java.StructuralPatterns.compositepattern.parkinglot;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = null;
        boolean flag = true;

        while(flag){
            String[] command = (new Scanner(System.in)).nextLine().split(" ");
            switch (command[0]){
                case "create_parking_lot":

                    if(parkingLot != null) {
                        System.out.println("Parking lot is already initialized, try some other command");
                        break;
                }
                    parkingLot = new ParkingLot(Integer.parseInt(command[2]),Integer.parseInt(command[3]));
                    System.out.println("Created parking lot with "+ command[2] + " floors and " +
                            command[3] + " slots per floor");
                    break;
                case "display":
                    parkingLot.display(command[1], VehicleType.valueOf(command[2]));
                    break;
                case "park_vehicle":
                    assert parkingLot != null;
                    parkingLot.parkVehicle(VehicleType.valueOf(command[1]),command[2], command[3]);
                    break;
                case "unpark_vehicle":
                    assert parkingLot != null;
                    parkingLot.unparkVehicle(command[1]);
                    break;
                case "exit":
                    System.out.println("GOOD  BYE !!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }
}
