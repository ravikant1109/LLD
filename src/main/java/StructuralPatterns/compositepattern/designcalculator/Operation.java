package main.java.StructuralPatterns.compositepattern.designcalculator;

public class Operation implements Expression{

    Expression first;
    Expression second;
    Operator operator;
    public Operation(Expression firstpart, Expression secondpart, Operator operator ){
        first = firstpart;
        second = secondpart;
        this.operator = operator;
    }
    @Override
    public float evaluate() {

        return switch (operator) {
            case ADD -> first.evaluate() + second.evaluate();
            case SUB -> first.evaluate() - second.evaluate();
            case MUL -> first.evaluate() * second.evaluate();
            case DIV -> first.evaluate() / second.evaluate();
        };
    }
}
