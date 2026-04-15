package com.xworkz.override.concert;

public class ConcertRunner {

    public static void main(String[] args) {
        int[] seats = {100, 200, 300};

        Organizer organizer = new Organizer("EventPro", "Bangalore");

        Concert concert = new Concert("Music Night", 120, 1500.0, seats, ConcertType.ROCK, organizer);
        LiveConcert live= new LiveConcert("Live Fest", 180, 2500.0, seats, ConcertType.POP, organizer, true, "Arijit Singh");

        concert.start();
        concert.end();
        System.out.println(concert);

        live.start();
        live.end();
        live.showArtist();
        System.out.println(live);
    }
}
