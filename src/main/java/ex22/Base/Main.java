/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.text.DecimalFormat;
import java.util.HashSet;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        HashSet<Double> numbers = new HashSet<>();
        double largest = 0;

        for (int i = 0; i < 3; i++) {
            double temp = 0;
            boolean isProceed = false;

            do {
                System.out.print("Enter number " + (i + 1) + ": ");

                try {
                    temp = Input.readDouble(System.in, true, true);
                    isProceed = true;
                } catch (NumberFormatException nfe) {
                    System.out.println(nfe.getMessage());
                }
            }while (!isProceed);

            if (!numbers.add(temp))
                exit(1);

            if (i == 0)
                largest = temp;
            else {
                if (temp > largest)
                    largest = temp;
            }
        }
        System.out.println("The largest number is " +
                ((largest == (long) largest) ? String.format("%d", (long)largest) : String.format("%s", largest)));
    }
}
