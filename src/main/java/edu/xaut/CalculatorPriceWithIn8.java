package edu.xaut;

public class CalculatorPriceWithIn8 implements CalculatorStrategy {

    public int calculate(int distance, long time) {
        TimeCalculator timeCalculator = new TimeCalculator();
        return (int) Math.round(CalculatorStartPrice.START_PRICE + (distance - 2) * 0.8 + timeCalculator.calculate(time));
    }
}
