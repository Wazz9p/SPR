package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread{
    ArrayList<User> users = new ArrayList<User>();

    @Override
    public void run()
    {
        int i=0;
        while(i!=10)
        {
          CreateUsers(i);
            i++;
            for (var user : users) {
                user.printInformation();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }

    }
    private void CreateUsers(int i)
    {
        String name = "UserName"+ i;
        try {
            users.add(new User(name, 1000, "1111"));
        } catch (RuntimeException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
