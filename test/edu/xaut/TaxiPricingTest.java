package edu.xaut;

import edu.xaut.utils.ScannerWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TaxiPricingTest {

    private TaxiPricing taxiPricing;

    @Before
    public void setUp() throws Exception {
        taxiPricing = new TaxiPricing();
    }

    @Test
    public void testDisplayPrice() throws Exception {
        TaxiCalculator calculator = mock(TaxiCalculator.class);
        when(calculator.calculate()).thenReturn(6.2f);

        String display = taxiPricing.displayPrice(calculator);

        assertEquals(display, "TaxiPrice is 6 yuan.");
    }

    @Test
    public void testDisplayPriceRound() throws Exception {
        TaxiCalculator calculator = mock(TaxiCalculator.class);
        when(calculator.calculate()).thenReturn(5.8f);

        String display = taxiPricing.displayPrice(calculator);

        assertEquals(display, "TaxiPrice is 6 yuan.");
    }

    @Test
    public void testGetDistanceValidate() throws Exception {
        ScannerWrapper scanner = mock(ScannerWrapper.class);
        when(scanner.getValue()).thenReturn(1.0);

        double distance = taxiPricing.getDistance(scanner);

        assertEquals(1.0, distance, 0.01);
    }

    @Test
    public void testGetDistanceZeroInvalidate() throws Exception {
        ScannerWrapper scanner = mock(ScannerWrapper.class);
        when(scanner.getValue()).thenReturn(0.0);

        double distance = taxiPricing.getDistance(scanner);

        assertEquals(0.0, distance, 0.01);
    }
}