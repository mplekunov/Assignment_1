/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the price of item " + (i + 1) + " ");
            double price = Double.parseDouble(new Scanner(System.in).nextLine());

            System.out.print("Enter the quantity of item " + (i + 1) + " ");
            int quantity = Integer.parseInt(new Scanner(System.in).nextLine());

            items.add(new Item(price, quantity));
        }

        Checkout checkout = new Checkout(items);

        System.out.println("Subtotal: " + NumberFormat.getCurrencyInstance().format(checkout.getSubtotal()));
        System.out.println("Tax: " + NumberFormat.getCurrencyInstance().format(checkout.getTax()));
        System.out.println("Total " + NumberFormat.getCurrencyInstance().format(checkout.getTotal()));
    }
}
