/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many euros are you expecting? ");
        double euros = Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("What is the exchange rate? ");
        double exchangeRate = Double.parseDouble(new Scanner(System.in).nextLine());

        Exchanger ex = new Exchanger(euros, exchangeRate);

        System.out.println(new DecimalFormat("#.#").format(euros).concat(" euros at an exchange rate of ")
                .concat(new DecimalFormat("#.##").format(exchangeRate)).concat(" is\n")
                .concat(Double.toString(ex.convertEURtoUSD())).concat(" U.S. dollars."));
    }
}
