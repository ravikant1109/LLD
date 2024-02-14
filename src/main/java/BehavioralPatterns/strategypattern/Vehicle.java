package main.java.BehavioralPatterns.strategypattern;

import main.java.BehavioralPatterns.strategypattern.strategy.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy obj){
        this.drivingStrategy = obj;
    }

    public void drive(){
        drivingStrategy.drive();
    }

}
