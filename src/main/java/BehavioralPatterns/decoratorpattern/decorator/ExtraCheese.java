package main.java.BehavioralPatterns.decoratorpattern.decorator;

import main.java.BehavioralPatterns.decoratorpattern.BasePizza;
import main.java.BehavioralPatterns.decoratorpattern.NonVegPizza;

public class ExtraCheese extends Toppings{

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return 100+ this.basePizza.cost();
    }

}
