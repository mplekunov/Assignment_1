/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("Both C and c should be related to Celsius")
    public void testCelsiusCase() {
        InputStream inputStream;

        inputStream = new ByteArrayInputStream(("c").getBytes(StandardCharsets.UTF_8));
        Temperature lowerC =  Main.readTemperature(inputStream);

        inputStream = new ByteArrayInputStream(("C").getBytes(StandardCharsets.UTF_8));
        Temperature upperC = Main.readTemperature(inputStream);

        assertEquals(Temperature.Celsius, upperC, "Upper C");
        assertEquals(Temperature.Celsius, lowerC, "Lower C");
    }

    @Test
    @DisplayName("Both F and f should be related to Celsius")
    public void testFahrenheitCase() {
        InputStream inputStream;

        inputStream = new ByteArrayInputStream(("f").getBytes(StandardCharsets.UTF_8));
        Temperature lowerF = Main.readTemperature(inputStream);

        inputStream = new ByteArrayInputStream(("F").getBytes(StandardCharsets.UTF_8));
        Temperature upperF = Main.readTemperature(inputStream);

        assertEquals(Temperature.Fahrenheit, upperF, "Upper F");
        assertEquals(Temperature.Fahrenheit, lowerF, "Lower F");
    }

    @Test
    @DisplayName("Conversion from Celsius to Fahrenheit")
    public void testConvertCelsiusToFahrenheit() {
        String output = new DecimalFormat("#.#").format(TemperatureConverter.convertTemperature(32, Temperature.Fahrenheit));
        assertEquals("89.6", output, "Celsius to Fahrenheit");
    }

    @Test
    @DisplayName("Conversion from Fahrenheit to Celsius")
    public void testConvertFahrenheitToCelsius() {
        String output = new DecimalFormat("#.#").format(TemperatureConverter.convertTemperature(32, Temperature.Celsius));
        assertEquals("0", output, "Fahrenheit to Celsius");
    }
}
