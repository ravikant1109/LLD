package main.java.StructuralPatterns.compositepattern.designcalculator;

public class Main {

    public static void main(String[] args) {
        Number number1 = new Number(1);
        Number number2 = new Number(2);
        Number number3 = new Number(3);
        Operation operation1 = new Operation(number1,number2,Operator.ADD);
        Operation operation2 = new Operation(number3, operation1, Operator.MUL);
        System.out.println(operation2.evaluate());
    }
}
