package com.client;

import com.dao.UserDAO;
import com.model.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserMainTest {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User user1 = new User(1,"email","password","User1");
        userDAO.create(user1);

        User user2 = new User(2,"email","password","User2");
        userDAO.create(user2);

        User user3 = new User(3,"email","password","User3");
        userDAO.create(user3);

        userDAO.delete(2);

        System.out.println(userDAO.getAll());
        System.out.println(userDAO.get(1));



    }

}
