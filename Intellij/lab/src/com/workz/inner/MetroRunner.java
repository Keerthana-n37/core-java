package com.workz.inner;

public class MetroRunner {

    public static void main(String[] args) {

        Metro metro= new NammaMetro();

        metro.announcements();
        metro.arrive();
        metro.depart();
        metro.ticketBooking();
        Metro.metroTimings();
    }
}
