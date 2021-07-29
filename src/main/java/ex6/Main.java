/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        String age = new Scanner(System.in).nextLine();

        System.out.print("At what age would you like to retire? ");
        String retirementAge = new Scanner(System.in).nextLine();

        RetirementCalculator rCalculator = new RetirementCalculator(age, retirementAge);

        printOutput(rCalculator.getYearsLeft(), rCalculator.getCurrentYear(), rCalculator.getRetirementYear());
    }

    public static void printOutput(int yearsLeft, int currentYear, int retirementYear) {
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");
    }
}