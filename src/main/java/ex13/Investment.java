/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.text.DecimalFormat;

public class Investment {
    private double principal;
    private double interestRate;
    private double numOfYears;
    private int numOfInterestsPerYear;

    public Investment(double principal, double interestRate, double numOfYears, int numOfInterestsPerYear) {
        this.principal = principal;
        this.interestRate = interestRate / 100.0;
        this.numOfYears = numOfYears;
        this.numOfInterestsPerYear = numOfInterestsPerYear;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getNumOfYears() {
        return numOfYears;
    }

    public int getNumOfInterestsPerYear() {return numOfInterestsPerYear; }

    public double getPrincipal() { return principal; }

    public double getInvestment() {
        return Double.parseDouble( new DecimalFormat("#.##")
                .format (principal * Math.pow((1 + interestRate / numOfInterestsPerYear), numOfInterestsPerYear * numOfYears)));
    }

}
