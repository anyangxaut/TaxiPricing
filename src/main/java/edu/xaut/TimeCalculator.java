package edu.xaut;

public class TimeCalculator {

    public static final double PRICE_PER_MIN = 0.25;

    public float calculate(long time) {
        int min = convert(time);
        return (float) (min * PRICE_PER_MIN);
    }

    private int convert(long time) {
        return (int) (time / 1000 / 60);
    }
}
