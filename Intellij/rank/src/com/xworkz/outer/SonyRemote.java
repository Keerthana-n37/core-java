package com.xworkz.outer;

import com.xworkz.inner.Remote;

public class SonyRemote implements Remote {

    @Override
    public void turnOn() {
        System.out.println("Running turnOn method in SonyRemote");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff method in SonyRemote");
    }
}
