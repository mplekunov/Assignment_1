/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class SalesTaxCalculator {
    private List<State> states;

    public SalesTaxCalculator(State state) {
        this.states = new ArrayList<>();
        this.states.add(state);
    }

    public SalesTaxCalculator(List<State> states) {
        this.states = new ArrayList<>();
        this.states.addAll(states);
    }

    public double calculateTax(double price, String stateName, String countyName) {
        State state = states.stream().filter(o -> o.getFullName()
                .equals(stateName.toLowerCase())).findFirst().orElse(null);

        if (state != null) {
            double countyTax = 0;

            try {
                countyTax = state.getCounties().get(countyName);
            } catch (NullPointerException e){
                //ignore
            }

            return price * (state.getSaleTax() + countyTax);
        } else
            return price;
    }
}
