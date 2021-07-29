/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter length: ");
        double length = Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Enter width: ");
        double width = Double.parseDouble(new Scanner(System.in).nextLine());

        PaintCalculator pCalculator = new PaintCalculator(length, width);

        DecimalFormat dFormat = new DecimalFormat("###.##");

        System.out.print("You will need to purchase " + pCalculator.getGallonsOfPaint() + " gallons of paint to cover "
                + dFormat.format(pCalculator.getArea()) + " square feet.");
    }
}
