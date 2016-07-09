package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorPriceWithIn8Test {

    CalculatorPriceWithIn8 priceWithIn8;

    @Before
    public void setUp() throws Exception {
        priceWithIn8 = new CalculatorPriceWithIn8();
    }

    @Test
    public void testPriceWithTimeAndDistance() throws Exception {
        int distance = 4;
        long time = 6 * 60 * 1000;

        float money = priceWithIn8.calculate(distance, time);

        assertEquals(money, 9.1, 0.01);
    }
}
