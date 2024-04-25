package main.java.StructuralPatterns.compositepattern.parkinglot;

public class Vehicle {

    private VehicleType vehicleType;
    private String regNumber;
    private String color;

    public Vehicle(VehicleType vehicleType, String regNumber, String color) {
        this.vehicleType = vehicleType;
        this.regNumber = regNumber;
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
