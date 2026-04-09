package com.xworkz.runtimepolymorphism.car;

public class BMWRunner {

    public static void main(String[] args) {
        Car car= new BMW();
        BMW bmw=new BMW();
        Car car1=new Car();
        car.drive();
        bmw.drive();
        car1.drive();
    }
}
