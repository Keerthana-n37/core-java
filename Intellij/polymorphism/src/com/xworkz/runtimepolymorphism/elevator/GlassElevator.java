package com.xworkz.runtimepolymorphism.elevator;

public class GlassElevator extends Elevator{

    @Override
    public void move() {
        System.out.println("Glass elevator moves with view");
    }
}
