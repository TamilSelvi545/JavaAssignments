package com.tnsif.assignment3.bank;
public class SavingsAccount extends Account {

    public SavingsAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to SavingsAccount");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from SavingsAccount");
        } else {
            System.out.println("Insufficient balance in SavingsAccount");
        }
    }

    public double getBalance() {
        return balance;
    }
}
