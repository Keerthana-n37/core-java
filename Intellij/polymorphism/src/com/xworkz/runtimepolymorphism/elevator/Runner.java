package com.xworkz.runtimepolymorphism.elevator;

public class Runner {

    public static void main(String[] args) {

        GlassElevator elevator= new GlassElevator();
        elevator.move();

        Elevator elevator1= new Elevator();
        elevator1.move();
    }
}
