/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testInvestmentClassGetInvestmentMethod() {
        double in_principal = 1500;
        double in_interestRate = 4.3;
        double in_numYears = 4;

        Investment investment = new Investment(in_principal, in_interestRate, in_numYears);

        double expected = 1758;

        assertEquals(expected, investment.getInvestment());
    }
}
