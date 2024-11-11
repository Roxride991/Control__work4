package org.example;
import java.time.LocalDate;

public class Product_store extends Product{
    private LocalDate expirationDate;

    public Product_store(String name, double price , LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    public int Calculate(double amount) {
        return super.Calculate(amount);
    }
}
