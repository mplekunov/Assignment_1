/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");

        String word = new Scanner(System.in).nextLine();

        System.out.print(word + " has " + word.length() + " characters.");
    }
}
