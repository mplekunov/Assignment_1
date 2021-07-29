/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testPrintOut() {
        RetirementCalculator rCalculator = new RetirementCalculator("25", "65");

        int yearsLeft = rCalculator.getYearsLeft();
        int currentYear = rCalculator.getCurrentYear();
        int retirementYear = rCalculator.getRetirementYear();

        Calendar temp = Calendar.getInstance();
        assertEquals(65 - 25, yearsLeft);
        assertEquals(temp.get(Calendar.YEAR), currentYear);
        temp.add(Calendar.YEAR, 65-25);
        assertEquals(temp.get(Calendar.YEAR), retirementYear);
    }
}
