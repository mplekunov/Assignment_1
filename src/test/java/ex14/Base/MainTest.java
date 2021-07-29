/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private ByteArrayOutputStream out;

    private final PrintStream defOut = System.out;

    @BeforeEach
    public void setOut() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void setDefOut() {
        System.setOut(defOut);
    }

    @Test
    public void testTaxCalculatorWhenIfEqualsTrue() {
        Main.printOutput(10, "WI");

        String expected = "The subtotal is $10.00.\n" +
                "The tax is $0.55.\n" +
                "The total is $10.55.\n";

        assertEquals(expected, out.toString().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testTaxCalculatorWhenIfEqualsFalse(){
        Main.printOutput(10, "MN");

        String expected = "The total is $10.00.\n";

        assertEquals(expected, out.toString().replaceAll("\r\n", "\n"));
    }

}
