package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public String processPayment(double amount) {
        return "Processed payment of $" + amount;
    }
}