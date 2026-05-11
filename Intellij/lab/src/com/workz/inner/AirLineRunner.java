package com.workz.inner;

public class AirLineRunner {

    public static void main(String[] args) {

        AirLine airLine=new Indigo();

        airLine.foodService();
        airLine.land();
        airLine.safetyInstructions();
        airLine.takeoff();
        AirLine.airlineInfo();
    }
}
