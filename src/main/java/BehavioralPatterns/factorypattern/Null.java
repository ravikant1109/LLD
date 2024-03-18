package main.java.BehavioralPatterns.factorypattern;

public class Null implements Shape{
    @Override
    public void draw() {
        System.out.println("Nothing to draw,wrong input choice");
    }
}
