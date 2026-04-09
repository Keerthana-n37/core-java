package com.xworkz.runtimepolymorphism.payment;

public class SmartPay extends Payment{

    @Override
    public void pay() {
        System.out.println("Pay using QR code or card");
    }
}
