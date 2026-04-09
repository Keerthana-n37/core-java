package com.xworkz.runtimepolymorphism.Bank;

public class SBI extends Bank{

    @Override
    public void getInterestRate() {
        System.out.println("Interest rate in SBI is 5%");
    }
}
