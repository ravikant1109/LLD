package main.java.StructuralPatterns.compositepattern.parkinglot;

public class Slot {

    private VehicleType slotType;
    private boolean isOccupied;
    private int id;
    private Vehicle vehicle;

    private String ticket;
    public Slot(VehicleType slotType, boolean isOccupied, int id) {
        this.slotType = slotType;
        this.isOccupied = isOccupied;
        this.id = id;
    }

    public VehicleType getSlotType() {
        return slotType;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setSlotType(VehicleType slotType) {
        this.slotType = slotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
