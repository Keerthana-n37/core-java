package com.xworkz.runtimepolymorphism.mobile;

public class SmartPhone extends Mobile{

    @Override
    public void unlock() {
        System.out.println("Unlock using Face ID or FingerPrint");
    }
}
