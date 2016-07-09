package edu.xaut;

public class CalculatorStartPrice implements CalculatorStrategy {

    private static final int START_PRICE = 6;

    public float calculate(int distance, long time) {
        TimeCalculator calculator = new TimeCalculator();
        return START_PRICE + calculator.calculate(time);
    }
}
