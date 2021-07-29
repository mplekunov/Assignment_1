/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testPizza() {
        Pizza pz = new Pizza(8, 2, 8);

        assertEquals(8, pz.getPeople());
        assertEquals(2, pz.getPizza());
        assertEquals(16, pz.getSlicesTotal());
        assertEquals(2, pz.getSlicesPerPerson());
        assertEquals(0, pz.getLeftOvers());
    }

}
