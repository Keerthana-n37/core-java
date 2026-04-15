package com.xworkz.override.concert;

public class LiveConcert extends Concert{


    boolean isOutdoor;
    String artist;

    LiveConcert(String title, int duration, double ticketPrice, int[] seats, ConcertType type, Organizer organizer, boolean isOutdoor, String artist) {
        super(title, duration, ticketPrice, seats, type, organizer);
        this.isOutdoor = isOutdoor;
        this.artist = artist;
    }

    void start() {
        System.out.println("Live concert " + title + " started");
    }

    void end() {
        System.out.println("Live concert " + title + " ended");
    }

    void showArtist() {
        System.out.println("Artist: " + artist);
    }

    public String toString() {
        return "LiveConcert{isOutdoor=" + isOutdoor +
                ", artist='" + artist + "'} " + super.toString();
    }
}
