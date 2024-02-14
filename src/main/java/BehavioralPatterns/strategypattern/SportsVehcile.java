package main.java.BehavioralPatterns.strategypattern;


import main.java.BehavioralPatterns.strategypattern.strategy.SportsDriving;

public class SportsVehcile extends Vehicle{

    public SportsVehcile() {
        super(new SportsDriving());
    }

}
