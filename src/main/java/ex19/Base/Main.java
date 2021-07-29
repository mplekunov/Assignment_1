/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.javatuples.Pair;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Pair<Double, Double> weightHeight = readUserInput(System.in, System.out);

        printOutput(System.out, BMICalculator.calculateBMI(weightHeight.getValue0(), weightHeight.getValue1()));
    }

    public static Pair<Double, Double> readUserInput(InputStream inputStream, PrintStream printStream) {

        double weight = getDouble(inputStream,"Enter your weight (in pounds): ", printStream);

        double height = getDouble(inputStream,"Enter your height (in inches): ", printStream);

        return new Pair<>(weight, height);
    }

    public static double getDouble(InputStream inputStream, String messageBeforeAskingInput, PrintStream printStream) {
        boolean canContinue = false;
        double num = 0;
        do {
            printStream.print(messageBeforeAskingInput);

            try {
                num = Input.readDouble(inputStream, false, false);
                canContinue = true;
            } catch (NumberFormatException | InputMismatchException e) {
                printStream.println(e.getMessage());
            }

        } while (!canContinue);

        return num;
    }

    public static void printOutput(PrintStream printStream, double bmi) {
        String output = "Your BMI is " + bmi + ".\n";

        if (bmi <= BMICalculator.BMI_UPPER) {
            if (bmi >= BMICalculator.BMI_LOWER)
                output = output.concat("You are within the ideal weight range.");
            else
                output = output.concat("You are underweight. You should see your doctor.");
        } else
            output = output.concat("You are overweight. You should see your doctor.");

        printStream.print(output);
    }
}
