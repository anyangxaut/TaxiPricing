package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorPriceMoreThan8Test {

    CalculatorPriceMoreThan8 calculatorPriceMoreThan8;

    @Before
    public void setUp() throws Exception {
        calculatorPriceMoreThan8 = new CalculatorPriceMoreThan8();
    }

    @Test
    public void testCalculatorPriceWhenDistanceMoreThan8() throws Exception {
        long time = 2 * 1000 * 60;
        int distance = 10;

        float money = calculatorPriceMoreThan8.calculate(distance, time);
        assertEquals(13.7, money, 0.01);
    }
}
