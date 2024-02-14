package main.java.BehavioralPatterns.decoratorpattern.decorator;

import main.java.BehavioralPatterns.decoratorpattern.BasePizza;

public class ExtraChicken extends Toppings {

    public ExtraChicken(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int cost() {
        return 250 + this.basePizza.cost();
    }
}
