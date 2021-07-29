/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public final class Input {
    public static final String NUMBER_FORMAT_EXCEPTION_MSG = "Don't test my patience... enter numeric value!";
    public static final String INPUT_MISMATCH_EXCEPTION_MSG = "The number cannot be zero and it should be positive you donut...";

    private Input() {}

    public static double readDouble(InputStream inputStream, boolean isNegativeAllowed, boolean isZeroAllowed)
            throws InputMismatchException, NumberFormatException {

        double userInput = 0;

        try {
            userInput = Double.parseDouble(new Scanner(inputStream).nextLine());
        } catch (NumberFormatException nf) {
            throw new NumberFormatException(NUMBER_FORMAT_EXCEPTION_MSG);
        }

        if (userInput < 0 && !isNegativeAllowed || userInput == 0 && !isZeroAllowed)
            throw new InputMismatchException(INPUT_MISMATCH_EXCEPTION_MSG);

        return userInput;
    }

    public static int readInteger(InputStream inputStream, boolean isNegativeAllowed, boolean isZeroAllowed)
            throws InputMismatchException, NumberFormatException {

        int userInput = 0;

        try {
            userInput = Integer.parseInt(new Scanner(inputStream).nextLine());
        } catch (NumberFormatException nf) {
            throw new NumberFormatException(NUMBER_FORMAT_EXCEPTION_MSG);
        }

        if (userInput < 0 && !isNegativeAllowed || userInput == 0 && !isZeroAllowed)
            throw new InputMismatchException(INPUT_MISMATCH_EXCEPTION_MSG);

        return userInput;

    }

    public static String readString(InputStream inputStream) {
        return new Scanner(inputStream).nextLine();
    }
}
