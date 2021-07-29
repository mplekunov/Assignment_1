/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    private ByteArrayOutputStream out;
    private final OutputStream defOut = System.out;

    @BeforeEach
    public void setUpOut() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testCase1() {
        Main.printResult("10", "5");
        String expected = "10 + 5 = 15\n" +
                            "10 - 5 = 5\n" +
                            "10 * 5 = 50\n" +
                            "10 / 5 = 2\n";

        assertEquals(expected, out.toString().replaceAll("\r\n", "\n"));
    }
}
