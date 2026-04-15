package com.xworkz.override.movie;

import java.util.Arrays;

public class Movie {

    String title;
    int duration;
    double rating;
    String[] qarray;
    MovieType type;
    Director director;

    Movie(String title, int duration, double rating, String[] qarray, MovieType type, Director director) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.qarray = qarray;
        this.type = type;
        this.director = director;
    }

    void play() {
        System.out.println("Playing movie " + title);
    }

    void stop() {
        System.out.println("Stopping movie " + title);
    }

    public String toString() {
        return "Movie{title='" + title + "', duration=" + duration + ", rating=" + rating + ", qarray=" + Arrays.toString(qarray) + ", type=" + type + ", director=" + director + "}";
    }
}
