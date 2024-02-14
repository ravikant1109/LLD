package main.java.BehavioralPatterns.strategypattern;

public class Rider {
    public static void main(String[] args) {

        Vehicle vehicle = new SportsVehcile();
        vehicle.drive();
        Vehicle vehicle1 = new DailyCommuter();
        vehicle1.drive();
        Vehicle vehicle2 = new OffRoadVehcile();
        vehicle2.drive();


    }
}
