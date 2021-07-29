/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testTemplateString() {
        String noun = "dog";
        String verb = "walk";
        String adjective = "blue";

        MadLib madLib = new MadLib(noun, verb, adjective);
        String expected = "Do you walk your blue dog quickly? That's hilarious!";
        assertEquals(expected, madLib.getCompletedTemplate());
    }

}
