package com.mphasis.secondspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

    private PaymentService paymentService;
    private String orderId = "ORD-101";

    @Autowired
    public Order(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println(orderId);
        System.out.println(paymentService.processPayment(5000));
    }
}