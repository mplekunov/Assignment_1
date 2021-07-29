/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAreaCalculation() {

        double outArea = new Area(15, 20).getArea();
        double expected_feet = 300;
        double expected_meters = 27.871;

        assertEquals(expected_feet, outArea);
        assertEquals(expected_meters, Conversion.convert(outArea));
    }

}
