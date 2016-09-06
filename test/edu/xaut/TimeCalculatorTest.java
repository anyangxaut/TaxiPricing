package edu.xaut;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TimeCalculatorTest {

    TimeCalculator timeCalculator;

    @Before
    public void setUp() throws Exception {
        timeCalculator = new TimeCalculator();


    }

    @Test
    public void testTimeCalculator() throws Exception {
        long time = 4 * 60 * 1000;

        float price = timeCalculator.calculate(time);

        assertEquals(price, 1.0f);
    }
}
