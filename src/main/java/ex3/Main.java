/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the quote?");

        String quoteStr = new Scanner(System.in).nextLine();

        System.out.print("Who said it?");

        String authorStr = new Scanner(System.in).nextLine();

        Quote quoteObj = new Quote(authorStr, quoteStr);

        System.out.println(quoteObj.getFormattedQuote());
    }
}
