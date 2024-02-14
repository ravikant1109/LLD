package main.java.BehavioralPatterns.decoratorpattern.decorator;

import main.java.BehavioralPatterns.decoratorpattern.BasePizza;

public abstract class Toppings extends BasePizza {
    BasePizza basePizza;

    public Toppings(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public abstract int cost();
}
