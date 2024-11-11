package org.example;

public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public  int Calculate(double amount) {
        return (int) (amount / price);
    }
}
