/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testCase1() {
        String expected = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        Quote quoteObj = new Quote("Obi-Wan Kenobi", "These aren't the droids you're looking for.");
        assertEquals(expected, quoteObj.getFormattedQuote());
    }
}
