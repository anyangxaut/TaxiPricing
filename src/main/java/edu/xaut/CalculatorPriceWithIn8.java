package edu.xaut;

public class CalculatorPriceWithIn8 implements CalculatorStrategy {

    private static final float PRICE_PER_DISTANCE = 0.8f;

    public float calculate(int distance, long time) {
        CalculatorStartPrice startPrice = new CalculatorStartPrice();
        return startPrice.calculate(distance, time) + (distance - 2) * PRICE_PER_DISTANCE;
    }
}
