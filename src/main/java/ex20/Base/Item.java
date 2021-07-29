/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

public class Item {
    private int quantity;
    private double totalPriceWithoutTaxes;
    private double totalPriceWithTaxes;
    private double taxes;

    public Item(int quantity, double priceWithoutTaxes, double taxes) {
        this.quantity = quantity;
        this.totalPriceWithoutTaxes = priceWithoutTaxes * this.quantity;
        this.taxes = taxes;
        this.totalPriceWithTaxes = setTotalWithTaxes();
    }

    private double setTotalWithTaxes() {
        return totalPriceWithoutTaxes + taxes;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPriceWithTaxes() {
        return totalPriceWithTaxes;
    }

    public double getTotalPriceWithoutTaxes() {
        return totalPriceWithoutTaxes;
    }

    public double getTaxes() {
        return taxes;
    }
}
