/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.util.Scanner;

public final class Input {

    public static String readString(InputStream inputStream) {
        return new Scanner(inputStream).nextLine();
    }

    public static double readDouble(InputStream inputStream) {
        return Double.parseDouble(new Scanner(inputStream).nextLine());
    }

    public static int readInteger(InputStream inputStream) {
        return Integer.parseInt(new Scanner(inputStream).nextLine());
    }
}
