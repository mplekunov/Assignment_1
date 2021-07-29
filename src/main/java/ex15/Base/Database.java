/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

package Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    private List<User> userList;

    public Database() {
        userList = new ArrayList<>();
    }

    public Database(User...users) {
        this();
        for (var user : users) {
            if (userList.stream().noneMatch(o -> o.getUsername().equals(user.getUsername())))
                userList.add(user);
        }
    }

    public Database(List<User> users) {
        this();
        for (var user : users) {
            if (userList.stream().noneMatch(o -> o.getUsername().equals(user.getUsername())))
            userList.add(user);
        }
    }

    public boolean isVerified(User user) {
        return userList.stream().filter(o -> o.getUsername().equals(user.getUsername()))
                .anyMatch(o -> o.getPassword().equals(user.getPassword()));
    }
}