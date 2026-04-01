package com.mphasis.secondspringapp.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ShoppingCart {

    @Autowired(required = false)
    private DiscountService discountService;

    public void checkout(double amount) {
        if (discountService != null) {
            System.out.println(discountService.applyDiscount(amount));
        }
    }
}