package com.workz.inner;

public interface Metro {

    String city="bangalore";
    int coaches=6;
    boolean AC=true;

    void arrive();
    void depart();

    default void ticketBooking(){
        System.out.println("Executing ticketBooking in Metro");
    }

    default void announcements()
    {
        System.out.println("Executing announcements in Metro");
    }

    static void metroTimings()
    {
        System.out.println("Executing metroTimings in Metro");
    }
}
