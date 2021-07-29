/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void TestCheckout() {
        int price_1 = 25;
        int qty_1 = 2;

        int price_2 = 10;
        int qty_2 = 1;

        int price_3 = 4;
        int qty_3 = 1;

        double subtotal_exp = 64;
        double tax_exp = 3.52;
        double total_exp = 67.52;

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(price_1, qty_1));
        items.add(new Item(price_2, qty_2));
        items.add(new Item(price_3, qty_3));

        Checkout checkout = new Checkout(items);

        assertEquals(subtotal_exp, checkout.getSubtotal());
        assertEquals(tax_exp, checkout.getTax());
        assertEquals(total_exp, checkout.getTotal());
    }
}
