/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class SayingHello
{
    private static String greeting = "Hello, nice to meet you!";

    public void greetUser() {
        String userName = getUserName();

        String greeting = this.greeting.substring(0, 5) + ", " + userName + this.greeting.substring(5);

        System.out.print(greeting);
    }

    private String getUserName() {
        System.out.print("What is your name? ");
        return new Scanner(System.in).nextLine();
    }
}