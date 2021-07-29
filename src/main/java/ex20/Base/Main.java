/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<State> states = new ArrayList<>();

        TreeMap<String, Double> counties = new TreeMap<>();
        counties.put("Eau Claire", 0.005);
        counties.put("Dunn", 0.004);

        states.add(new State("Wisconsin", "WI", 0.05, counties));
        states.add(new State("Illinois", "IL", 0.08));

        Item item = readAndProcessUserInput(System.in, System.out, new SalesTaxCalculator(states));

        printOutput(System.out, item);
    }

    public static Item readAndProcessUserInput(InputStream inputStream, PrintStream outputStream, SalesTaxCalculator stc) {
        int orderAmount = 0;
        double price = 1;
        boolean isContinue = false;

        do {
            outputStream.print("What is the order amount? ");

            try {
                orderAmount = Input.readInteger(inputStream, false, false);
                isContinue = true;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (!isContinue);

        outputStream.print("What state do you live in? ");
        String stateName = Input.readString(inputStream);

        outputStream.print("What county do you live in? ");
        String countyName = Input.readString(inputStream);

        return new Item(orderAmount, price, stc.calculateTax(orderAmount * price, stateName, countyName));
    }

    public static void printOutput(PrintStream printStream,  Item item) {
        String output = "";

        if (item.getTaxes() != 0)
            output = output.concat("The tax is " + NumberFormat.getCurrencyInstance().format(item.getTaxes()) + ".\n");

        output = output.concat("The total is " + NumberFormat.getCurrencyInstance()
                .format(item.getTotalPriceWithTaxes()) + ".\n");

        printStream.print(output);
    }
}