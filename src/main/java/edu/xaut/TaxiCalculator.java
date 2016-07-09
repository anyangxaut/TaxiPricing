package edu.xaut;

public class TaxiCalculator {

    private static final int START_DISTANCE = 2;
    private static final int MORE_THAN_DISTANCE = 8;

    private int distance;
    private long time;

    public TaxiCalculator(int distance, long time) {
        this.distance = distance;
        this.time = time;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public float calculate() {
        Context context;
        if (distance > MORE_THAN_DISTANCE) {
            context = new Context(new CalculatorPriceMoreThan8());
        } else if (distance > START_DISTANCE) {
            context = new Context(new CalculatorPriceWithIn8());
        } else {
            context = new Context(new CalculatorStartPrice());
        }
        return context.operator(distance, time);
    }
}

