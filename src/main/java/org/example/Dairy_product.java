package org.example;

import java.util.List;

public class Dairy_product extends Product{
    private String info;

    public Dairy_product(String name, double price, String info) {
        super(name, price);
        this.info = info;
    }
    public String getInfo(String info) {
        return info;
    }

    @Override
    public int Calculate(double amount) {
        return super.Calculate(amount);
    }
}
