package main.java.BehavioralPatterns.factorypattern;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape = factory.getShape("CIRCLE");
        Shape shape1 = factory.getShape("RECTANGLE");
        shape.draw();
        shape1.draw();
    }
}
