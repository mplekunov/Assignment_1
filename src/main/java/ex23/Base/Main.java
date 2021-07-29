/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");

        if(evaluateInput(System.in)) {
            System.out.println("Are the battery terminals corroded?");

            if(evaluateInput(System.in))
                System.out.println("Clean terminals and try starting again.");
            else
                System.out.println("Replace cables and try again.");

        }else {
            System.out.println("Does the car make a slicking noise?");

            if(evaluateInput(System.in))
                System.out.println("Replace the battery.");
            else {
                System.out.println("Does the car crank up but fail to start?");

                if(evaluateInput(System.in))
                    System.out.println("Check spark plug connections.");
                else {
                    System.out.println("Does the engine start and then die?");

                    if(evaluateInput(System.in)) {
                        System.out.println("Does you car have fuel injection?");

                        if(evaluateInput(System.in))
                            System.out.println("Get it in for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }

    public static boolean evaluateInput(InputStream inputStream) {
        return new Scanner(inputStream).nextLine().equalsIgnoreCase("yes");
    }
}
