/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String noun = new Scanner(System.in).nextLine();
        String verb = new Scanner(System.in).nextLine();
        String adjective = new Scanner(System.in).nextLine();

        MadLib madLib = new MadLib(noun, verb, adjective);
        System.out.print(madLib.getCompletedTemplate());
    }
}
