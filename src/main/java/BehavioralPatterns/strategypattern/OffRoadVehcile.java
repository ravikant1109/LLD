package main.java.BehavioralPatterns.strategypattern;


import main.java.BehavioralPatterns.strategypattern.strategy.SportsDriving;

public class OffRoadVehcile extends Vehicle{

    public OffRoadVehcile(){
        super(new SportsDriving());
    }
}
