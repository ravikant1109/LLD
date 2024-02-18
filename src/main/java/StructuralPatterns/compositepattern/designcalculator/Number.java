package main.java.StructuralPatterns.compositepattern.designcalculator;

public class Number implements Expression {

    float number;
    public Number(float num){
        number = num;
    }
    @Override
    public float evaluate() {
        return number;
    }
}
