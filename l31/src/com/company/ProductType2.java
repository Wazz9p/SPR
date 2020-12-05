package com.company;

class Product2 extends Product {
    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String info() {
        return this.name+" "+this.price;
    }

    @Override
    public double getPrice() {
        return this.price * 0.2;
    }
}
