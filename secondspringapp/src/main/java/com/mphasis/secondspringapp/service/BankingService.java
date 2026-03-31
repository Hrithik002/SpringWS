package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Service;

@Service
public class BankingService {

    public void createAccount(String holder, double balance) {
        System.out.println("Creating account for " + holder);
    }

    public void deposit(String account, double amount) {
        System.out.println("Depositing " + amount + " into " + account);
    }

    public void withdraw(String account, double amount) {
        System.out.println("Withdrawing " + amount + " from " + account);
    }
}