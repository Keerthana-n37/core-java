package com.xworkz.runtimepolymorphism.car;

public class BMW extends Car{

    @Override
    public void drive() {
        System.out.println("BMW self driving feature");
    }
}
