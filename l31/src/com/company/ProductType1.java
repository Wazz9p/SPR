package com.company;

class ProductType1 extends Product {
    public ProductType1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String info() {
        return this.name+" "+this.price;
    }
}

