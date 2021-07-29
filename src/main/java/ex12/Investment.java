/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.text.DecimalFormat;

public class Investment {
    private double principal;
    private double interestRate;
    private double numOfYears;

    public Investment(double principal, double interestRate, double numOfYears) {
        this.principal = principal;
        this.interestRate = interestRate / 100.0;
        this.numOfYears = numOfYears;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getNumOfYears() {
        return numOfYears;
    }

    public double getInvestment() {
        return Double.parseDouble( new DecimalFormat("#.##").format (principal * (1 + interestRate * numOfYears)));
    }

}
