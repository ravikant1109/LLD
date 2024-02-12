//package strategypattern;

import strategy.NormalDriving;

public class DailyCommuter extends Vehicle {

    public DailyCommuter(){
        super(new NormalDriving());
    }

}
