package com.client;

import com.model.User;
import com.repository.UserDAO;
import com.repository.UserDAOjdbc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserMainTest {
    public static void main(String[] args) {
        UserDAOjdbc userDAO = new UserDAOjdbc();
//        User user1 = new User(1,"mohit@gmail.com","password1","Mohit Singhvi");
//        userDAO.create(user1);
//
//        User user2 = new User(2,"Vamshi@gmail.com","password2","Vamshikiran Ganga ");
//
//        userDAO.create(user2);
//
//        User user3 = new User(3,"Aakash@gmail.com","password3","Aakash Khandelia");
//
//        userDAO.create(user3);



//        userDAO.delete(2);

        System.out.println(userDAO.listAll());
        System.out.println(userDAO.count());
        userDAO.close();
//        System.out.println(userDAO.get(1));



    }

}
