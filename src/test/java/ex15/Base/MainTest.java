/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    private Database db = new Database(new User("Mekromic", "123PassWord"));

    @Test
    public void testUserVerificationIfUserIsNotInDatabase(){
        List<User> usersToTest = new ArrayList<>();

        usersToTest.add(new User("Mekromic", "123password"));
        usersToTest.add(new User("Mekromic", "123"));
        usersToTest.add(new User("mekromic", "123PassWord"));
        usersToTest.add(new User("mekromic", "123password"));

        for (var user : usersToTest) {
            assertFalse(db.isVerified(user));
        }
    }

    @Test
    public void testUserVerificationIfUserIsInDatabase(){
        assertTrue(db.isVerified(new User("Mekromic", "123PassWord")));
    }
}
