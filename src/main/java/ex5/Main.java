/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        String num_1 = new Scanner(System.in).nextLine();

        System.out.print("What is the second number? ");
        String num_2 = new Scanner(System.in).nextLine();

        printResult(num_1, num_2);
    }

    public static String removeTrailingZeros(String str) {
        return str.contains(".") ? str.replaceAll("0*$", "").replaceAll("\\.$", "") : str;
    }

    public static void printResult(String num_1, String num_2) {
        SimpleMath sm = new SimpleMath(num_1, num_2);

        System.out.println(num_1.concat(" + ").concat(num_2).concat(" = ").concat(removeTrailingZeros(sm.add().toString()))
                .concat("\n").concat(num_1.concat(" - ").concat(num_2).concat(" = ").concat(removeTrailingZeros(sm.subtract().toString())))
                .concat("\n").concat(num_1.concat(" * ").concat(num_2).concat(" = ").concat(removeTrailingZeros(sm.multiply().toString())))
                .concat("\n").concat(num_1.concat(" / ").concat(num_2).concat(" = ").concat(removeTrailingZeros(sm.divide().toString()))));
    }
}
