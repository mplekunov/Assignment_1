/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.getInstance;

public class RetirementCalculator {
    private int currentAge;
    private int retirementAge;
    private int yearsLeft;
    private Calendar currentYear;
    private Calendar retirementYear;

    public RetirementCalculator(String currentAge, String retirementAge) {
        this.currentAge = Integer.parseInt(currentAge);
        this.retirementAge = Integer.parseInt(retirementAge);
        this.yearsLeft = this.retirementAge - this.currentAge;

        this.currentYear = getInstance();
        this.retirementYear = setRetirementYear();
    }

    private Calendar setRetirementYear() {
        Calendar temp = Calendar.getInstance();
        temp.add(Calendar.YEAR, this.yearsLeft);
        return temp;
    }

    public int getRetirementYear() {return this.retirementYear.get(Calendar.YEAR);}
    public int getCurrentYear() { return this.currentYear.get(Calendar.YEAR);}
    public int getYearsLeft() { return this.yearsLeft;}
}
