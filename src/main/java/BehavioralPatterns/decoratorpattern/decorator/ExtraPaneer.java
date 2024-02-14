package main.java.BehavioralPatterns.decoratorpattern.decorator;

import main.java.BehavioralPatterns.decoratorpattern.BasePizza;

public class ExtraPaneer extends Toppings {

    public ExtraPaneer(BasePizza basePizza){
        super(basePizza);
    }

    @Override
    public int cost() {
        return 120 + this.basePizza.cost();
    }
}
