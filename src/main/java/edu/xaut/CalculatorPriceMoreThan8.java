package edu.xaut;

public class CalculatorPriceMoreThan8 implements CalculatorStrategy {

    private static final float PRICE_PER_DISTANCE = 0.4f;

    public float calculate(int distance, long time) {
        CalculatorPriceWithIn8 priceWithIn8 = new CalculatorPriceWithIn8();
        return (distance - 8) * PRICE_PER_DISTANCE + priceWithIn8.calculate(distance, time);
    }
}
