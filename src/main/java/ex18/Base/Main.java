/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import javax.management.InstanceNotFoundException;
import java.io.InputStream;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert form Celsius to Fahrenheit.\nYour choice: ");
        Temperature temperature = readTemperature(System.in);

        System.out.print("Please enter the temperature in " +
                (temperature == Temperature.Celsius ? "Fahrenheit: " : "Celsius: "));
        double degrees = Input.readDouble(System.in);

        printOutput(degrees, temperature);
    }

    public static Temperature readTemperature(InputStream inputStream) {
        String input = Input.readString(inputStream);
        Temperature temperature = null;

        switch (input.toLowerCase()) {
            case "c" -> temperature = Temperature.Celsius;
            case "f" -> temperature = Temperature.Fahrenheit;
        }

        return temperature;
    }

    public static void printOutput(double degrees, Temperature to) {
        String output = "The temperature in ";

        if (to == Temperature.Celsius)
            output = output.concat("Celsius is ");
        else
            output = output.concat("Fahrenheit is ");

        System.out.println(output.concat(new DecimalFormat("#.##")
                .format(TemperatureConverter.convertTemperature(degrees, to))));
    }
}
