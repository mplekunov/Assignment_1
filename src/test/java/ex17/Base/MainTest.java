/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    private ByteArrayInputStream in;
    private ByteArrayOutputStream out;

    private final InputStream defIn = System.in;

    private void getIn(String input) {
        in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
    }

    @AfterEach
    public void setInDef() {
        System.setIn(defIn);
    }

    @Test
    @DisplayName("Input of any non digits character should not work")
    public void testInputWithNonDigits() {
        getIn("a");
        assertThrows(NoSuchElementException.class, () -> {
            Input.readDouble(System.in, true, true);
        });
    }

    @Test
    @DisplayName("Input should not be negative when it's not allowed")
    public void testInputWithNegatives() {
        getIn("-2");
        assertThrows(NoSuchElementException.class, () -> {
            Input.readDouble(System.in, false, true);
        });
    }

    @Test
    @DisplayName("Input should not be 0 when it's not allowed")
    public void testInputWithZero() {
        getIn("0");
        assertThrows(NoSuchElementException.class, ()-> {
            Input.readDouble(System.in, false, false);
        });
    }

    @Test
    @DisplayName("Input should return correct number")
    public void testInputWithCorrectNumber() {
        double userInput;

        getIn("1");
        userInput = Input.readDouble(System.in, false, false);
        assertEquals(1, userInput, "Input > 0");

        getIn("0");
        userInput = Input.readDouble(System.in, true, true);
        assertEquals(0, userInput, "Input == 0");

        getIn("-1");
        userInput = Input.readDouble(System.in, true, true);
        assertEquals(-1, userInput, "Input < 0");
    }

    @Test
    @DisplayName("BAC Calculator should return correct values")
    public void testBACCalculator() {
        BloodAlcoholCalculator bac;

        bac = new BloodAlcoholCalculator(20, 152, 2, Gender.MALE);
        assertEquals("0.46", new DecimalFormat("#.##").format(bac.calculateBAC()), "Male");

        bac = new BloodAlcoholCalculator(20, 152, 2, Gender.FEMALE);
        assertEquals("0.42", new DecimalFormat("#.##").format(bac.calculateBAC()), "Female");
    }

}
