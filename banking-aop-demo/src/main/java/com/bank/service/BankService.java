package com.bank.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public Account createAccount(String accountHolder, double initialBalance) {
        System.out.println("Creating account for: " + accountHolder);
        return new Account(accountHolder, initialBalance);
    }

    public void deposit(String accountNumber, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        System.out.println("Depositing " + amount + " to account: " + accountNumber);
    }

    public void withdraw(String accountNumber, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        System.out.println("Withdrawing " + amount + " from account: " + accountNumber);
    }

    public double checkBalance(String accountNumber) {
        System.out.println("Checking balance for: " + accountNumber);
        return 1000.0;
    }
}
