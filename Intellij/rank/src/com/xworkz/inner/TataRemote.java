package com.xworkz.inner;

public class TataRemote implements Remote{

    @Override
    public void turnOn() {
        System.out.println("Executing turnOn method in TataRemote");
    }

    @Override
    public void turnOff() {
        System.out.println("Executing turnOff method in TataRemote");
    }
}
