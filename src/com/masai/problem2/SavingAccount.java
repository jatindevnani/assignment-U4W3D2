package com.masai.problem2;

public class SavingAccount {
    private int accountNumber;
    private double balance;

    void deposit (int amount) {

        this.balance += amount;
    }

    void withdraw(double amount) {
        if(amount > balance) {
            throw new InsufficientFundException("Insufficient Amount in the Account");
        }
        this.balance -= amount;
    }

    double getBalance() {
        return this.balance;
    }
}
