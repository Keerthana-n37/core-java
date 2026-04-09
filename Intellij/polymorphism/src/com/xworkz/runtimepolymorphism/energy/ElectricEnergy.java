package com.xworkz.runtimepolymorphism.energy;

public class ElectricEnergy extends Energy{

    @Override
    public void usage() {
        System.out.println("Electric energy is used to power metro trains,homes");
    }
}
