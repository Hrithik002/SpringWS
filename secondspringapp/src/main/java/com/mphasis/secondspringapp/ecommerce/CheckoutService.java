package com.mphasis.secondspringapp.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    private final ProductRepository productRepository;

    @Autowired
    public CheckoutService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}