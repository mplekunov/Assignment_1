/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.text.DecimalFormat;

public final class BMICalculator {
    public final static double BMI_UPPER = 25;
    public final static double BMI_LOWER = 18.5;

    private BMICalculator() {}

    public static double calculateBMI(double weight, double height) {
        return Double.parseDouble(new DecimalFormat("#.#").format((weight / Math.pow(height, 2)) * 703));
    }
}
