package com.mphasis.secondspringapp.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

    @Value("P001")
    private String productId;

    @Value("Laptop")
    private String name;

    @Value("999.99")
    private double price;

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
