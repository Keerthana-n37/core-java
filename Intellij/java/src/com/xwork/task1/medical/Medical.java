package com.xwork.task1.medical;

public class Medical {

    int medicineId;
    String name;
    double price;
    String expiryDate;
    String company;

    Medical()
    {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.company = company;
    }

    void displayInfo()
    {
        System.out.println("Executing displayInfo in Medical");
        System.out.println("Medicine ID: " + this.medicineId);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Expiry Date: " + this.expiryDate);
        System.out.println("Company: " + this.company);
    }
}
