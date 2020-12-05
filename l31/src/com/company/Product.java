package com.company;

import java.io.Serializable;

public abstract class Product implements Serializable {
    public double price;
    public String name;
    public abstract String info();
    public double getPrice() {
        return price;
    }
}




