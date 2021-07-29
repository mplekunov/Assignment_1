/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testEchanger() {
        double euros = 81;
        double exRate = 137.51;

        double expected = 111.38;
        Exchanger ex = new Exchanger(euros, exRate);

        assertEquals(expected, ex.convertEURtoUSD());
    }
}
