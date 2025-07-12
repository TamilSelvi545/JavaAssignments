package com.tnsif.assignment3.bank;
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000);
        CheckingAccount ca = new CheckingAccount("CA456", 10000);

        Transaction transaction = new Transaction();

        transaction.performTransaction(sa, 2000, true);   // Deposit
        transaction.performTransaction(ca, 3000, false);  // Withdraw

        sa.displayDetails();
        ca.displayDetails();

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}