package com.masai.problem2;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount();
        try {
            savings.deposit(20);
            savings.withdraw(15);
            savings.withdraw(15);
        } catch (InsufficientFundException error) {
            System.out.println(error.getMessage());
        }
        System.out.println(savings.getBalance());
        System.out.println("End of main");
    }
}
