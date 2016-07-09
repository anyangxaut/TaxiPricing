package edu.xaut;

public class CalculatorPriceWithIn8 implements CalculatorStrategy {

    public int calculate(int distance, long time) {
        return (int) Math.round(CalculatorStartPrice.START_PRICE + (distance - 2) * 0.8 + time / 1000 / 60 * 0.25);
    }
}
