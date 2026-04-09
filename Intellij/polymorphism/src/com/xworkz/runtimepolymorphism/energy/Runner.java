package com.xworkz.runtimepolymorphism.energy;

public class Runner {

    public static void main(String[] args) {

        ElectricEnergy energy= new ElectricEnergy();
        energy.usage();

        Energy energy1= new Energy();
        energy1.usage();
    }
}
