/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private ByteArrayInputStream in;
    private ByteArrayOutputStream out;

    private final PrintStream defaultOut = System.out;
    private final InputStream defaultIn = System.in;

    @BeforeEach
    public void setUpOutput() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    private void getInput(String name) {
        in = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
    }

    private String getOutput() {
        return out.toString();
    }

    @AfterEach
    public void restoreInOut() {
        System.setIn(defaultIn);
        System.setOut(defaultOut);
    }

    @Test
    public void testCase1() { testOutput("string"); }
    @Test
    public void testCase2() { testOutput("word");}

    private void testOutput(String word) {
        getInput(word);

        Main.main(new String[0]);

        assertTrue(getOutput().contains(word + " has " + word.length() + " characters."));
    }
}
