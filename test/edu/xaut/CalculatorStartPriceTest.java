package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorStartPriceTest {

    CalculatorStartPrice startPrice;

    @Before
    public void setUp() throws Exception {
        startPrice = new CalculatorStartPrice();
    }

    @Test
    public void testCalculatePriceIsStartPriceWhenDistanceIsEqualStartDistance() throws Exception {
        int distance = TaxiCalculator.START_DISTANCE;
        long time = 60000;

        int money = startPrice.calculate(distance, time);

        assertEquals(6, money);
    }

    @Test
    public void testCalculatePriceIsStartPriceWhenTimeIs0() throws Exception {
        int distance = 1;
        long time = 0;

        int money = startPrice.calculate(distance, time);

        assertEquals(6, money);
    }

    @Test
    public void testCalulatePriceIsStartPriceIsNot0() throws Exception {
        int distance = 1;
        long time = 120000;

        int money = startPrice.calculate(distance, time);

        assertEquals(7, money);

    }
}