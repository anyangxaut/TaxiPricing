package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiCalculatorTest {

    TaxiCalculator calculator;

    @Test
    public void testCalculateWhenDistanceLessThanStartDistance() throws Exception {
        int distance = 1;
        long time = 2 * 60 * 1000;

        calculator = new TaxiCalculator(distance, time);
        float money = calculator.calculate();

        assertEquals(money, 6.5, 0.01);
    }

    @Test
    public void testCalculateWhenDistanceWithin8() throws Exception {
        int distance = 4;
        long time = 2 * 60 * 1000;

        calculator = new TaxiCalculator(distance, time);
        float money = calculator.calculate();

        assertEquals(money,8.1,0.01);
    }

    @Test
    public void testCalculateWhenDistanceMoreThan8() throws Exception {
        int distance = 10;
        long time = 2 * 60 * 1000;

        calculator = new TaxiCalculator(distance, time);
        float money = calculator.calculate();

        assertEquals(money,13.7,0.01);
    }
}