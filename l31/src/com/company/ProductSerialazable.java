package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductSerialazable {
    public ProductSerialazable() {
        mySer();
    }

    private void mySer() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product1.dat"))) {
            ArrayList<Product> listOfProduct = new ArrayList<>();

            listOfProduct.add(new ProductType1("product1", 10));
            listOfProduct.add(new Product2("product2", 100));
            oos.writeObject(listOfProduct);

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Product> myDeser() {
        ArrayList<Product> newList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product1.dat"))) {
            newList = ((ArrayList<Product>) ois.readObject());

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        return newList;
    }
}
