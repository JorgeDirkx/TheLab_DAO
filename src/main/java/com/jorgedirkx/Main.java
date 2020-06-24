package com.jorgedirkx;

public class Main {

    public static void main(String[] args) {

        DAO dao = new UserDaoImpl();

        //print all the users:

        for(User user:dao.getAllUSers()){
            System.out.println(user);
        }


        //update user
        User user1 = dao.getAllUSers().get(0);
        user1.setName("Testname");
        dao.updateUser(user1);

        /*

        //get user
        dao.getUser(1);
        System.out.println("user:" + user1.getName()); */
    }
}
