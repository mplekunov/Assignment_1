/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        //Database doesn't adds users who have the username that matches ones already stored in database
        Database db = new Database(
                new User("Mekromic", "123PassWord"),
                new User("Dr. Struggle", "StruggleIsReal"));

        System.out.print("Enter username: ");
        String username = Input.readString(System.in);

        System.out.print("Enter password: ");
        String password = Input.readString(System.in);

        User user = new User(username, password);

        printOutput(db, user);
    }

    public static void printOutput(Database db, User user) {
        if (db.isVerified(user))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you!");
    }
}
