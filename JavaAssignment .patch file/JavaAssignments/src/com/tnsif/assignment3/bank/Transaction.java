package com.tnsif.assignment3.bank;
public class Transaction {
	    private final double transactionFee = 10.0;

	    public final void performTransaction(Account acc, double amount, boolean isDeposit) {
	        System.out.println("--- Transaction Start ---");

	        if (isDeposit) {
	            acc.deposit(amount);
	        } else {
	            acc.withdraw(amount + transactionFee);
	            System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
	        }

	        System.out.println("Updated Balance: ₹" + acc.getBalance());
	        System.out.println("--- Transaction End ---\n");
	    }
	}


