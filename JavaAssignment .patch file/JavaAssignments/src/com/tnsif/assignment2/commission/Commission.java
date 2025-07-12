package com.tnsif.assignment2.commission;
import java.util.Scanner;

public class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter address: ");
        address = sc.nextLine();

        System.out.print("Enter phone: ");
        phone = sc.nextLine();

        System.out.print("Enter sales amount: ");
        salesAmount = sc.nextDouble();
    }

    public void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        }

        System.out.println("Commission for " + name + " is: ₹" + commission);
    }
}
