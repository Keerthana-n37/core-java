package com.xwork.task1.PanCard;

public class PanCard {

    String panNumber;
    String holderName;
    String dob;
    String address;
    String fatherName;

    void displayInfo()
    {
        System.out.println("Executing displayInfo in PanCard");
        System.out.println("PAN Number: " + this.panNumber);
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("DOB: " + this.dob);
        System.out.println("Address: " + this.address);
        System.out.println("Father Name: " + this.fatherName);
    }
}
