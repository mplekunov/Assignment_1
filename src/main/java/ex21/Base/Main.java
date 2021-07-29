/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        int monthNum = 0;
        String monthName = "";
        boolean isProceed = false;

        do {
            System.out.print("Please enter the number of the month: ");

            try {
                monthNum = Input.readInteger(System.in, false, false);
                isProceed = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            if (isProceed) {
                try {
                    monthName = Months.getMonthName(monthNum);
                } catch (NoSuchElementException nse) {
                    isProceed = false;
                    System.out.println(nse.getMessage());
                }
            }
        }while (!isProceed);

        System.out.println("The name of the month is " + monthName.concat("."));


    }
}
