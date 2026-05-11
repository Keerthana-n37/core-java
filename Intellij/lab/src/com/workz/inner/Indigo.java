package com.workz.inner;

public class Indigo implements AirLine{

    @Override
    public void takeoff() {
        System.out.println("Executing takeOff in Indigo");
    }

    @Override
    public void land() {
        System.out.println("Executing land method in Indigo ");
    }
}
