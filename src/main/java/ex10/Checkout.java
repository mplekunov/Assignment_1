/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.List;

public class Checkout {
    private static final double TAX_RATE = 0.055;

    private double subtotal;
    private double total;
    private double tax;

    public Checkout(double subtotal) {
        this.subtotal = subtotal;
        this.tax = subtotal * TAX_RATE;
        this.total = subtotal * (1 + TAX_RATE);
    }

    public Checkout(List<Item> items) {
        this.subtotal = setSubtotal(items);
        this.tax = subtotal * TAX_RATE;
        this.total = subtotal * (1 + TAX_RATE);

    }

    public static double setSubtotal(List<Item> items) {
        double subtotal = 0;

        for (var item : items)
            subtotal += item.getTotalPrice();

        return subtotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return total;
    }
}
