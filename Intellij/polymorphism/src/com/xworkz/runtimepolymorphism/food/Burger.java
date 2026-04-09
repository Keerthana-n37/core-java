package com.xworkz.runtimepolymorphism.food;

public class Burger extends Food{

    @Override
    public void getTaste() {
        System.out.println("Burger has own taste");
    }
}
