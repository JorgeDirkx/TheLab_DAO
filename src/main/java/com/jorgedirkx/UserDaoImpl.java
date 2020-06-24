package com.jorgedirkx;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements DAO{


    //List is working as a database
    List<User> users;

    public UserDaoImpl(){
        //see List:
        users = new ArrayList<User>();
        User user1 = new User("J.DIRKX", "studio@jorgedirkx.com", 1);
        User user2 = new User("Testname 2", "testemail@test.com", 2);
        users.add(user1);
        users.add(user2);
    }

    //retrieve list of users from db
    public List<User> getAllUSers() {
        return users;
    }

    public User getUser(int idNr) {
        return users.get(idNr);
    }

    public void updateUser(User user) {
        users.get(user.getIdNr()).setName(user.getName());
        System.out.println("user with ID nr: " + user.getIdNr()+"updated in db");

    }

    public void deleteUSer(User user) {
        users.remove(user.getName());
        System.out.println("user:" + user.getName());

    }
}
