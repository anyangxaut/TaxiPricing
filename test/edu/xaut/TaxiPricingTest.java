package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anyang on 2016/7/6.
 */
public class TaxiPricingTest {
    private TaxiPricing taxiPricing;

    @Before
    public void setUp() throws Exception {
        taxiPricing = new TaxiPricing();
    }

    @Test
    public void testCalculatePriceInLevel1() throws Exception {
        assertEquals(6, taxiPricing.calculatePriceInLevel1());
    }

    @Test
    public void testCalculatePriceInLevel2() throws Exception {
        assertEquals(6, taxiPricing.calculatePriceInLevel2(2));
        assertEquals(9, taxiPricing.calculatePriceInLevel2(6));
        assertEquals(11, taxiPricing.calculatePriceInLevel2(8));
    }

    @Test
    public void testCalculatePriceInLevel3() throws Exception {
        assertEquals(11, taxiPricing.calculatePriceInLevel3(8));
        assertEquals(13, taxiPricing.calculatePriceInLevel3(10));
    }

    @Test
    public void testCalculatePrice() throws Exception {
        assertEquals(0, taxiPricing.calculatePrice(0));
        assertEquals(6, taxiPricing.calculatePrice(1));
        assertEquals(6, taxiPricing.calculatePrice(2));
        assertEquals(9, taxiPricing.calculatePrice(6));
        assertEquals(11, taxiPricing.calculatePrice(8));
        assertEquals(13, taxiPricing.calculatePrice(10));
    }

}