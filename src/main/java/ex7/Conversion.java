/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.text.DecimalFormat;

public final class Conversion {
    private static final double squaredMeters = 0.09290304;

    private Conversion() {}

    public static double convert(double squaredFeet) {
        DecimalFormat decimalFormat = new DecimalFormat("##.###"); //leading zeroes are omitted
        return Double.parseDouble(decimalFormat.format(squaredFeet * squaredMeters));
    }
}
