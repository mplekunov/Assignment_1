/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
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
    final PrintStream outDef = System.out;

    @BeforeEach
    public void setOut() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void setOutDef() {
        System.setOut(outDef);
    }

    @Test
    public void testLegalAgeOutput() {
        String legal_age = "You are old enough to legally drive.";
        Main.printOutput(35, 16);

        assertEquals(legal_age, out.toString().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testNotLegalAgeOutput() {
        String legal_age = "You are not old enough to legally drive.";
        Main.printOutput(15, 16);

        assertEquals(legal_age, out.toString().replaceAll("\r\n", "\n"));
    }
}
