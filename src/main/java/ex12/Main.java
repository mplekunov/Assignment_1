/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.math.RoundingMode;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the principle: ");
        double principal = Input.readDouble(System.in);

        System.out.print("Enter the rate of interest: ");
        double interestRate = Input.readDouble(System.in);

        System.out.print("Enter the number of years: ");
        double numOfYears = Input.readDouble(System.in);

        printOutput(principal, interestRate, numOfYears);
    }

    public static void printOutput(double principal, double interestRate, double numOfYears) {
        Investment investment = new Investment(principal, interestRate, numOfYears);

        NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
        nf.setMaximumFractionDigits(2);

        System.out.println("After " + (new DecimalFormat("#.#").format(investment.getNumOfYears()))
                .concat(" years at ") +  nf.format(investment.getInterestRate())
                .concat(", the investment will be worth ") + (NumberFormat.getCurrencyInstance(Locale.US).format(investment.getInvestment())));
    }
}
