/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public final class Months {
    private static final Map<Integer, String> Months = new HashMap<>() {{
        put(1, "January");
        put(2, "February");
        put(3, "March");
        put(4, "April");
        put(5, "May");
        put(6, "June");
        put(7, "July");
        put(8, "August");
        put(9, "September");
        put(10, "October");
        put(11, "November");
        put(12, "December");
    }};

    private Months() {}

    public static String getMonthName(int monthNumber) throws NoSuchElementException{
        if (Months.containsKey(monthNumber))
            return Months.get(monthNumber);
        else
            throw new NoSuchElementException("Who are you?! How could you not know that months are in the range of 1-12...");
    }
}
