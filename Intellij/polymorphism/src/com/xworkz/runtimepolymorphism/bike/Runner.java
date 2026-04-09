package com.xworkz.runtimepolymorphism.bike;

public class Runner {

    public static void main(String[] args) {

        RX100 rx100= new RX100();
        rx100.ride();

        Bike bike = new RX100();
        bike.ride();

        Bike bike1= new Bike();
        bike1.ride();
    }
}
