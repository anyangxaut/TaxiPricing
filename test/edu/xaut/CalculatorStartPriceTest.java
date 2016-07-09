package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorStartPriceTest {

    CalculatorStartPrice startPrice;

    @Before
    public void setUp() throws Exception {
        startPrice = new CalculatorStartPrice();
    }

    @Test
    public void testCalculatePriceIsStartPriceWhenDistanceIsEqualStartDistance() throws Exception {
        int distance = 2;
        long time = 60000;

        float money = startPrice.calculate(distance, time);

        assertEquals(6.25, money, 0.01);
    }

    @Test
    public void testCalculatePriceIsStartPriceWhenTimeIs0() throws Exception {
        int distance = 1;
        long time = 0;

        float money = startPrice.calculate(distance, time);

        assertEquals(6.0, money, 0.01);
    }

    @Test
    public void testCalulatePriceIsStartPriceIsNot0() throws Exception {
        int distance = 1;
        long time = 120000;

        float money = startPrice.calculate(distance, time);

        assertEquals(6.5, money, 0.01);
    }
}