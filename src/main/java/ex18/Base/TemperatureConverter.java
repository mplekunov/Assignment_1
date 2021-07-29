/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

public final class TemperatureConverter {

    private TemperatureConverter() {}

    public static double convertTemperature(double degrees, Temperature to) {
        return to == Temperature.Celsius ? computeCelsius(degrees) : computeFahrenheit(degrees);
    }

    private static double computeCelsius(double degrees) {
        return (degrees - 32) * 5 / 9;
    }

    private static double computeFahrenheit(double degrees) {
        return (degrees * 9 / 5) + 32;
    }

}
