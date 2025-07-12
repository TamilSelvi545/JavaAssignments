package com.tnsif.assignment3.bank;
public class CheckingAccount extends Account {

    public CheckingAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to CheckingAccount");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from CheckingAccount");
        } else {
            System.out.println("Insufficient balance in CheckingAccount");
        }
    }

    public double getBalance() {
        return balance;
    }
}