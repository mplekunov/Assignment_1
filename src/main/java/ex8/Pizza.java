/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

public class Pizza {
    private int num_people;
    private int num_pizza;
    private int num_slices_per_pizza;
    private int num_slices_per_person;
    private int num_left_overs;

    public Pizza(int num_people, int num_pizza, int num_slices_per_pizza) {
        this.num_people = num_people;
        this.num_pizza = num_pizza;
        this.num_slices_per_pizza = num_slices_per_pizza;
        this.num_slices_per_person = (num_pizza * num_slices_per_pizza) / num_people;
        this.num_left_overs = (num_pizza * num_slices_per_pizza) % num_people;
    }

    public int getPeople() {
        return this.num_people;
    }

    public int getPizza() {
        return this.num_pizza;
    }

    public int getSlicesTotal() {
        return this.num_slices_per_pizza * this.num_pizza;
    }

    public int getLeftOvers() {
        return this.num_left_overs;
    }

    public int getSlicesPerPerson() {
        return this.num_slices_per_person;
    }
}
