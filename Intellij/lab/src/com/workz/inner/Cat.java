package com.workz.inner;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("executing eat method in Cat");
    }

    @Override
    public void sleep() {
        System.out.println("executing sleep method in Cat");
    }
}
