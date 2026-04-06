package com.xworkz.travel;

public class Trip {

    String destination;

    Trip(String destination)
    {
        this.destination=destination;
    }

    public void startTrip()
    {
        System.out.println("Trip started to: "+destination);
    }
}
