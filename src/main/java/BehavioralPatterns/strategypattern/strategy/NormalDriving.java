package main.java.BehavioralPatterns.strategypattern.strategy;
public class NormalDriving implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
