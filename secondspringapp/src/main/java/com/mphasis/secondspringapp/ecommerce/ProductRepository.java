package com.mphasis.secondspringapp.ecommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private List<String> products;

    // ✅ Constructor initialization (RELIABLE)
    public ProductRepository() {
        products = new ArrayList<>();
        products.add("Laptop");
        products.add("Phone");
    }

    public List<String> getAllProducts() {
        return products;
    }
}