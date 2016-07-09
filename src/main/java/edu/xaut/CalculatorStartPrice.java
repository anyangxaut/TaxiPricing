package edu.xaut;

public class CalculatorStartPrice implements CalculatorStrategy {

    public static final int START_PRICE = 6;
    public static final double PRICE_PER_MIN = 0.25;

    public int calculate(int distance, long time) {
        return (int) Math.round(START_PRICE + time / 1000 / 60 * PRICE_PER_MIN);
    }
}
