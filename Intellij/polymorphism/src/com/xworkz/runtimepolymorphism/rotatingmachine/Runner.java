package com.xworkz.runtimepolymorphism.rotatingmachine;

public class Runner {

    public static void main(String[] args) {

        Fan fan= new Fan();
        fan.rotate();

        RotatingMachine machine= new RotatingMachine();
        machine.rotate();
    }
}
