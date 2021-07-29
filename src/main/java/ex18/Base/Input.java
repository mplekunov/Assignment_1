/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.util.Scanner;

public final class Input {
    private Input() {}

    public static double readDouble(InputStream inputStream) {
        return Double.parseDouble(new Scanner(inputStream).nextLine());
    }

    public static String readString(InputStream inputStream) {
        return new Scanner(inputStream).nextLine();
    }
}
