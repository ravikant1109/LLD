package main.java.BehavioralPatterns.strategypattern;

import main.java.BehavioralPatterns.strategypattern.strategy.NormalDriving;

public class DailyCommuter extends Vehicle {

    public DailyCommuter(){
        super(new NormalDriving());
    }

}
