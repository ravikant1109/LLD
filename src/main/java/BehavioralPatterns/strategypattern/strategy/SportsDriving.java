package main.java.BehavioralPatterns.strategypattern.strategy;

public class SportsDriving implements DrivingStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Driving");
    }
}
