/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BloodAlcoholCalculator bac = takeInput(System.in);

        printOutput(bac.calculateBAC());

    }

    public static BloodAlcoholCalculator takeInput(InputStream inputStream) {
        boolean isCorrect = false;
        Gender gender = null;
        do {
            System.out.print("Enter your Gender (Male or Female): ");
            String userInput = Input.readString(inputStream);

            if (!userInput.equalsIgnoreCase("male") && !userInput.equalsIgnoreCase("female")) {
                System.out.println("You are stupid, aren't you?! Next time you decide typing something, try reading the prompt!");
                isCorrect = false;
            }
            else {
                switch (userInput.toLowerCase()) {
                    case "male" -> gender = Gender.MALE;
                    case "female" -> gender = Gender.FEMALE;
                }

                isCorrect = true;
            }
        } while (!isCorrect);



        System.out.print("Enter your Weight (in pounds): ");
        double weight = Input.readDouble(inputStream, false, false);

        System.out.print("Enter the amount of time since your last drink (in hours): ");
        double hoursPassed = Input.readDouble(inputStream, false, true);

        System.out.print("Enter the amount of Alcohol you consumed (in oz): ");
        double alcoholConsumed = Input.readDouble(inputStream, false, true);

        return new BloodAlcoholCalculator(alcoholConsumed, weight, hoursPassed, gender);
    }

    public static void printOutput(double bacLevel) {
        System.out.println("Your BAC is " + new DecimalFormat("#.##").format(bacLevel));

        if (bacLevel >= BloodAlcoholCalculator.LEGAL_BAC) {
            System.out.println("It's not legal for you to drive.");
        }
        else
            System.out.println("It's legal for you to drive.");
    }
}
