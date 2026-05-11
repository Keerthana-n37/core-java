package com.workz.inner;

public interface AirLine {

    String name="Indigo";
    int seats=180;
    boolean international=true;

    void takeoff();
    void land();

    default void foodService()
    {
        System.out.println("Executing foodService in AirLine");
    }

    default void safetyInstructions()
    {
        System.out.println("Executing safetyInstructions in AirLine");
    }

    static void airlineInfo()
    {
        System.out.println("Executing airLineInfo in AirLine");
    }
}
