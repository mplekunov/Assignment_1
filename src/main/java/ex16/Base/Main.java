/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int LEGAL_AGE = 16;

        System.out.print("What is your age ");
        int age = Integer.parseInt(new Scanner(System.in).nextLine());

        printOutput(age, LEGAL_AGE);
    }

    public static void printOutput(int age, int legal_age) {
        System.out.print(age >= legal_age ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}
