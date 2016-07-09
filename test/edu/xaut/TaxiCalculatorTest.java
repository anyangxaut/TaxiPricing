package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiCalculatorTest {

    TaxiCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new TaxiCalculator();

    }

    @Test
    public void testCalculatePriceIsStartPriceWhenDistanceIsEqualStartDistance() throws Exception {
        int distance = TaxiCalculator.START_DISTANCE;

        int money = calculator.calculatePriceInLevel1();

        assertEquals(6, money);
    }

    @Test
    public void testCalculatePriceIsStartPriceWhenDistanceIsLessThanStartDistance() throws Exception {
        int distance = 1;

        int money = calculator.calculatePriceInLevel1();

        assertEquals(6, money);
    }

    @Test
    public void testCalculatePriceInLevel2() throws Exception {
        assertEquals(6, calculator.calculatePriceInLevel2(2));
        assertEquals(9, calculator.calculatePriceInLevel2(6));
        assertEquals(11, calculator.calculatePriceInLevel2(8));
    }

    @Test
    public void testCalculatePriceInLevel3() throws Exception {
        assertEquals(11, calculator.calculatePriceInLevel3(8));
        assertEquals(13, calculator.calculatePriceInLevel3(10));
    }

    @Test
    public void testCalculatePrice() throws Exception {
        assertEquals(0, calculator.calculatePrice(0));
        assertEquals(6, calculator.calculatePrice(1));
        assertEquals(6, calculator.calculatePrice(2));
        assertEquals(9, calculator.calculatePrice(6));
        assertEquals(11, calculator.calculatePrice(8));
        assertEquals(13, calculator.calculatePrice(10));
    }
}