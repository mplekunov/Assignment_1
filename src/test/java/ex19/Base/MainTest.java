/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    @DisplayName("Non numeric values should not be accepted by Main.getDouble()")
    public void testForNonNumericValues() {
        InputStream inputStream = new ByteArrayInputStream(("a").getBytes(StandardCharsets.UTF_8));
        Exception exception;

        try {
            Main.getDouble(inputStream, "", System.out);
        } catch (NumberFormatException nf) {
            assertTrue(nf.getMessage().contains(Input.NUMBER_FORMAT_EXCEPTION_MSG));
        } catch (NoSuchElementException ne) {
            //ignore
        }
    }

    @Test
    @DisplayName("Negative and zero values should not be accepted by Main.getDouble()")
    public void testForNegativeAndZeroValues() {
        InputStream isN = new ByteArrayInputStream(("-1").getBytes(StandardCharsets.UTF_8));

        try {
           Main.getDouble(isN, "", System.out);
        } catch (InputMismatchException im) {
            assertTrue(im.getMessage().contains(Input.INPUT_MISMATCH_EXCEPTION_MSG));
        } catch (NoSuchElementException ne) {
            //ignore
        }

        InputStream isZ = new ByteArrayInputStream(("0").getBytes(StandardCharsets.UTF_8));

        try {
            Main.getDouble(isZ, "", System.out);
        } catch (InputMismatchException im) {
            assertTrue(im.getMessage().contains(Input.INPUT_MISMATCH_EXCEPTION_MSG));
        } catch (NoSuchElementException ne) {
            //ignore
        }
    }

    @Test
    @DisplayName("BMI Calculator should return correct values")
    public void testBMICalculator() {
       assertEquals(21.8, BMICalculator.calculateBMI(152, 70));
    }

    @Test
    @DisplayName("Main.printOut() should cover all cases")
    public void testPrintOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);

        String exOverweight = "You are overweight. You should see your doctor.";
        String exUnderweight = "You are underweight. You should see your doctor.";
        String exNormal = "You are within the ideal weight range.";
        
        Main.printOutput(printStream, BMICalculator.BMI_LOWER - 5);
        assertTrue(out.toString().contains(exUnderweight));
        out.reset();

        Main.printOutput(printStream, BMICalculator.BMI_LOWER);
        assertTrue(out.toString().contains(exNormal));
        out.reset();

        System.out.println(out);
        Main.printOutput(printStream, BMICalculator.BMI_UPPER + 5);
        assertTrue(out.toString().contains(exOverweight));
        out.reset();
    }
}
