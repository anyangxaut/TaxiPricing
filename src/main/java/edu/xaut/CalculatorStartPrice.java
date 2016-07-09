package edu.xaut;

public class CalculatorStartPrice implements CalculatorStrategy {

    public static final int START_PRICE = 6;

    public int calculate(int distance, long time) {
        TimeCalculator calculator = new TimeCalculator();
        return Math.round(START_PRICE + calculator.calculate(time));
    }
}
