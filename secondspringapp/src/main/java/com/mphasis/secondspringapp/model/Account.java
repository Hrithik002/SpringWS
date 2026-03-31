package com.mphasis.secondspringapp.model;

public class Account {

    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{holder='" + holder + "', balance=" + balance + "}";
    }
}
