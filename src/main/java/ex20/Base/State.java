/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import com.sun.source.tree.Tree;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class State {
    private String fullName;
    private String abbreviation;
    private double saleTax;
    private Map<String, Double> counties;

    public State(String fullName, String abbreviation, double saleTax) {
        this.abbreviation = abbreviation.toLowerCase();
        this.fullName = fullName.toLowerCase();
        this.saleTax = saleTax;
        this.counties = new TreeMap<>();
    }

    public State(String fullName, String abbreviation, double saleTax, TreeMap<String, Double> counties) {
        this(fullName, abbreviation, saleTax);
        this.addCounties(counties);
    }

    public void addCounties(TreeMap<String, Double> countyMap) {
        this.counties.putAll(countyMap);
    }

    public void addCounty(String countyName, Double countySaleTax) {
        this.counties.put(countyName, countySaleTax);
    }

    public void removeCounty(String countyName) {
        this.counties.remove(countyName);
    }

    public Map<String, Double> getCounties(){
        return counties;
    }

    public double getSaleTax() {
        return saleTax;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
