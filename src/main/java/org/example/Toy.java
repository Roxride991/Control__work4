package org.example;

public class Toy extends Product {
    private int recommendedAge;

    public Toy(String name, double price , int recommendedAge) {
        super(name, price);
        this.recommendedAge = recommendedAge;

    }
    public boolean forAge(int age) {
        return age >= recommendedAge;
    }

    @Override
    public int Calculate(double amount) {
        return super.Calculate(amount);
    }
}

