package edu.xaut;

public class Context {

    private CalculatorStrategy calculatorStrategy;

    public Context(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public float operator(int distance, long time) {
        return calculatorStrategy.calculate(distance, time);
    }

}
