/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the order amount? ");
        int orderAmount = Input.readInteger(System.in);

        System.out.print("What is the state? ");
        String state = Input.readString(System.in);

        printOutput(orderAmount, state);
    }

    public static void printOutput(int orderAmount, String state) {
        final double TAX_RATE_WI = 0.055;
        final String STATE = "WI";

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String output = "";
        double tax = 0;

        if (state.equals(STATE))
        {
            tax = orderAmount * TAX_RATE_WI;

            output = "The subtotal is " + nf.format(orderAmount).concat(".\n")
                    .concat("The tax is ") + nf.format(tax).concat(".\n");
        }

        output = output.concat("The total is ") + nf.format(orderAmount + tax).concat(".");

        System.out.println(output);
    }
}
