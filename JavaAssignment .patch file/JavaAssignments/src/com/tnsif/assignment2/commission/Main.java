package com.tnsif.assignment2.commission;


public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Commission emp = new Commission();
        emp.acceptDetails();         
        emp.calculateCommission();   
    }
}

