package com.xworkz.runtimepolymorphism.person;

public class Developer extends Person{

    @Override
    public void doWork() {
        System.out.println("Developer writes code");
    }
}
