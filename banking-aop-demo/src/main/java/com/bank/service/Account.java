package com.bank.service;

public class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{holder='" + holder + "', balance=" + balance + "}";
    }
}
