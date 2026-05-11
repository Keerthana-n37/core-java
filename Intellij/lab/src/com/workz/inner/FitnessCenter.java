package com.workz.inner;

public class FitnessCenter implements Gym{

    @Override
    public void workout() {
        System.out.println("Executing workOut in FitnessCenter");
    }

    @Override
    public void rest() {
        System.out.println("Executing rest in FitnessCenter");
    }
}
