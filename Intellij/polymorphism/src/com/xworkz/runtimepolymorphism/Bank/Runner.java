package com.xworkz.runtimepolymorphism.Bank;

public class Runner {

    public static void main(String[] args) {

        SBI sbi= new SBI();
        sbi.getInterestRate();

        Bank bank= new Bank();
        bank.getInterestRate();

        Bank bank1= new  SBI();
        bank1.getInterestRate();
    }
}
