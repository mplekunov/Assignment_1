/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testPaintCalculator() {
        PaintCalculator pCalculator = new PaintCalculator(4, 90);

        assertEquals(360, pCalculator.getArea());
        assertEquals(2, pCalculator.getGallonsOfPaint());
    }
}
