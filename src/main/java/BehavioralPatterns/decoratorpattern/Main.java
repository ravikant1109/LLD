package main.java.BehavioralPatterns.decoratorpattern;

import main.java.BehavioralPatterns.decoratorpattern.decorator.ExtraCheese;
import main.java.BehavioralPatterns.decoratorpattern.decorator.ExtraChicken;
import main.java.BehavioralPatterns.decoratorpattern.decorator.ExtraPaneer;

public class Main {
    public static void main(String[] args) {

        BasePizza toppings = new ExtraPaneer(new ExtraCheese(new ExtraChicken(new NonVegPizza())));
        System.out.println(toppings.cost());

    }
}
