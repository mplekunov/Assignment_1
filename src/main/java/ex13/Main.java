/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the principle? ");
        double principal = Input.readDouble(System.in);

        System.out.print("Enter the rate of interest? ");
        double interestRate = Input.readDouble(System.in);

        System.out.print("Enter the number of years? ");
        double numOfYears = Input.readDouble(System.in);

        System.out.print("What is the number of times the interest is compounded per year? ");
        int numOfInterestsPerYear = Input.readInteger(System.in);

        printOutput(principal, interestRate, numOfYears, numOfInterestsPerYear);
    }

    public static void printOutput(double principal, double interestRate, double numOfYears, int numOfInterestsPerYear) {
        Investment investment = new Investment(principal, interestRate, numOfYears, numOfInterestsPerYear);

        NumberFormat nf = NumberFormat.getPercentInstance(Locale.US);
        nf.setMaximumFractionDigits(2);

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(investment.getPrincipal())
                .concat(" invested at ") + nf.format(investment.getInterestRate())
                .concat(" for ") + (df.format(investment.getNumOfYears()))
                .concat(" years compounded ") + (df.format(investment.getNumOfInterestsPerYear()))
                .concat(" times per year is ") + NumberFormat.getCurrencyInstance(Locale.US).format(investment.getInvestment()));
    }
}
