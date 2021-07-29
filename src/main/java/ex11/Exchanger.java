/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exchanger {
    private double exchangeRate;
    private double euro;

    public Exchanger(String euro, String exchangeRate) {
        this.euro = Double.parseDouble(euro);
        this.exchangeRate = Double.parseDouble(exchangeRate);
    }

    public Exchanger(Double euro, Double exchangeRate) {
        this.euro = euro;
        this.exchangeRate = exchangeRate;
    }

    public double convertEURtoUSD() {
        return Double.parseDouble(new DecimalFormat("##.##").format( this.euro * this.exchangeRate / 100));
    }

}
