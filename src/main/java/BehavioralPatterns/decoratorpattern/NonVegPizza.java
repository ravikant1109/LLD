package main.java.BehavioralPatterns.decoratorpattern;

public class NonVegPizza extends BasePizza{
    @Override
    public int cost() {
        return 300;
    }
}
