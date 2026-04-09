package com.xworkz.runtimepolymorphism.payment;

public class Runner {

    public static void main(String[] args) {

        SmartPay pay = new SmartPay();
        pay.pay();

        Payment pay1= new SmartPay();
        pay1.pay();

        Payment pay2 = new Payment();
        pay2.pay();

    }
}
