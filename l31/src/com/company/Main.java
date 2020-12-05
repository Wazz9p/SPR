package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ProductSerialazable productSerialazable = new ProductSerialazable();
        double overallBalance = 0;
        ArrayList<User> users = new ArrayList<User>();
        try {
            users.add(new User("Name1", 12000, "1111"));
            users.add(new User("Name2", 1200, "qwerty"));
            users.add(new User("Oleg", "123"));
        }
        catch (RuntimeException ex)
        {
            System.out.println(ex.getMessage());
        }
        users.removeIf(user -> user.balance == 0);
        for (var user : users) {
            overallBalance += user.balance;
            user.printInformation();

        }
        ArrayList<Product> newList = productSerialazable.myDeser();

    }
}
