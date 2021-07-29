/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many people? ");
        int num_people = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print("How many pizzas do you have? ");
        int num_pizza = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print("How many slices per pizza? ");
        int num_slices_per_pizza = Integer.parseInt(new Scanner(System.in).nextLine());

        Pizza pz = new Pizza(num_people, num_pizza, num_slices_per_pizza);

        System.out.println(pz.getPeople() + " people with " + pz.getPizza() + " pizzas (" + pz.getSlicesTotal() + " slices).");

        System.out.println("Each person gets " + pz.getSlicesPerPerson() + " pieces of pizza.");
        System.out.println("There are " + pz.getLeftOvers() + " leftover pieces.");
    }
}
