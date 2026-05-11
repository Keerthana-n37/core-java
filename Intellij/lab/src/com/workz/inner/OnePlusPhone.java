package com.workz.inner;

public class OnePlusPhone implements SmartPhone{

    @Override
    public void call() {
        System.out.println("Executing call method in oneplusphone");
    }

    @Override
    public void browse() {
        System.out.println("executing browse method in oneplusphone");
    }
}
