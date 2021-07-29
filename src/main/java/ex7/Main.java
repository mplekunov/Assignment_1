/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the length of the room in feet? ");
        String length = new Scanner(System.in).nextLine();

        System.out.print("What is the width of the room in feet? ");
        String width = new Scanner(System.in).nextLine();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        System.out.println("The area is");

        double area = new Area(length, width).getArea();

        System.out.println(area + " square feet");
        System.out.println(Conversion.convert(area) + " square meters");
    }
}
