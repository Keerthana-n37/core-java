package com.xworkz.override.concert;

import java.util.Arrays;

public class Concert {

    String title;
    int duration;
    double ticketPrice;
    int[] seats;
    ConcertType type;
    Organizer organizer;

    Concert(String title, int duration, double ticketPrice, int[] seats, ConcertType type, Organizer organizer) {
        this.title = title;
        this.duration = duration;
        this.ticketPrice = ticketPrice;
        this.seats = seats;
        this.type = type;
        this.organizer = organizer;
    }

    void start() {
        System.out.println("Concert " + title + " started");
    }

    void end() {
        System.out.println("Concert " + title + " ended");
    }

    public String toString() {
        return "Concert{title='" + title + "', duration=" + duration + ", ticketPrice=" + ticketPrice + ", seats=" + Arrays.toString(seats) + ", type=" + type + ", organizer=" + organizer + "}";
    }
}
