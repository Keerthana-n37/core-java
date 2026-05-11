package com.workz.inner;

public class NammaMetro implements Metro{

    @Override
    public void arrive() {
        System.out.println("Executing arrive method in NammaMetro");
    }

    @Override
    public void depart() {
        System.out.println("Executing depart method in NammaMetro");
    }
}
