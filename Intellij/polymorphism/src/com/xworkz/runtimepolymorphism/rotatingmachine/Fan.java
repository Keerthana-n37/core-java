package com.xworkz.runtimepolymorphism.rotatingmachine;

public class Fan extends RotatingMachine{

    @Override
    public void rotate() {
        System.out.println("Fan rotates to produce air");
    }
}
