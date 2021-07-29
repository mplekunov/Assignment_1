/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

public class BloodAlcoholCalculator {
    private double alcoholConsumed;
    private double bodyWeight;
    private double numHoursPassed;
    private Gender gender;

    public static final double LEGAL_BAC = 0.08;
    public static final double DISTRIBUTION_RATIO_MALE = 0.73;
    public static final double DISTRIBUTION_RATION_FEMALE = 0.66;


    public BloodAlcoholCalculator(double alcoholConsumed, double bodyWeight, double numHoursPassed, Gender gender) {
        this.alcoholConsumed = alcoholConsumed;
        this.bodyWeight = bodyWeight;
        this.numHoursPassed = numHoursPassed;
        this.gender = gender;
    }

    public double calculateBAC() {
        return (alcoholConsumed * 5.14 / bodyWeight * getDistributionRatio()) - (0.015 * numHoursPassed);
    }

    private double getDistributionRatio() {
        return this.gender == Gender.MALE ? DISTRIBUTION_RATIO_MALE : DISTRIBUTION_RATION_FEMALE;
    }

}

