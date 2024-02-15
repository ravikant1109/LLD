package main.java.BehavioralPatterns.factorypattern;

public class Factory {
//    Shape shape;

    Shape getShape(String shape){
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "TRIANGLE" -> new Triangle();
            default -> null;
        };
    }
}
