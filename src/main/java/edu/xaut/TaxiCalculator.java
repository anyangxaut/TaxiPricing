package edu.xaut;

public class TaxiCalculator {

    public static final int START_DISTANCE = 2;

    int calculatePriceInLevel1() {
        return 6;
    }

    int calculatePriceInLevel2(double distance) {
        return (int) Math.round(0.8 * (distance - 2) + 6);
    }

    int calculatePriceInLevel3(double distance) {
        return (int) Math.round((0.8 * (distance - 2)) + 6 + (0.4 * (distance - 8)));
    }

    public int calculatePrice(double distance) {
        if (distance > 8) {
            return calculatePriceInLevel3(distance);
        } else if (distance > 2) {
            return calculatePriceInLevel2(distance);
        } else if (distance > 0) {
            return calculatePriceInLevel1();
        } else {
            return 0;
        }
    }
}
