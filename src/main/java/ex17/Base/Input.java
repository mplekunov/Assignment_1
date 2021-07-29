/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.util.Scanner;

public final class Input {
    public static final String NUM_FORMAT_EXCEPTION = "Don't test my patience... enter numeric value!";
    public static final String NUM_NEGATIVE_EXCEPTON = "The number should be positive you donut...";
    public static final String NUM_ZERO_EXCEPTION = "The number cannot be zero.";

    private Input() {}

    public static double readDouble(InputStream inputStream, boolean isNegativeAllowed, boolean isZeroAllowed) {
        boolean isCorrect = false;
        double userInput = 0;

        do {
            try {
                userInput = Double.parseDouble(new Scanner(inputStream).nextLine());
                isCorrect = true;
            } catch (NumberFormatException nfe) {
                System.out.println(NUM_FORMAT_EXCEPTION);
            }

            if (isCorrect) {
                if (userInput < 0 && !isNegativeAllowed) {
                    isCorrect = false;
                    System.out.println(NUM_NEGATIVE_EXCEPTON);
                } else if (userInput == 0 && !isZeroAllowed) {
                    isCorrect = false;
                    System.out.println(NUM_ZERO_EXCEPTION);
                }
            }
        } while (!isCorrect);

        return userInput;
    }

    public static String readString(InputStream inputStream) {
        return new Scanner(inputStream).nextLine();
    }
}
