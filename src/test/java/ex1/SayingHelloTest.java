/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class SayingHelloTest {


    private ByteArrayOutputStream testOut; //Stores an outputStream from System.out provided by greetUser()
    private ByteArrayInputStream testIn; //Stores an inputStream from System.in provided by getUserName()

    //For Restoring purposes
    private final PrintStream systemOut = System.out;
    private final InputStream systemIn = System.in;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut)); //Reassigns std output stream to ByteArrayPrintStream
    }

    private void getInput(String name) {
        testIn = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
        System.setIn(testIn); //Reassigns std input stream to ByteArrayInputStream
    }

    private String getOutput() {
        return testOut.toString(); //Converts output stream to string
    }

    //Restores std input/output
    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testCase1() {testOutput("Michael");}
    @Test
    public void testCase2() {testOutput("James Peterson");}
    @Test
    public void testCase3() {testOutput("Andrew Ericsson Jr.");}

    public void testOutput(String name) {
        getInput(name); //Puts name into input stream

        SayingHello hw = new SayingHello();
        hw.greetUser();

        //Main.main(new String[0]); I can also call the main method directly

        assertEquals("What is your name? Hello, " + name + ", nice to meet you!", getOutput());
    }
}
