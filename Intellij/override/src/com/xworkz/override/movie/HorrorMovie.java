package com.xworkz.override.movie;

public class HorrorMovie extends Movie{

    boolean hasJumpScares;
    String intensity;

    HorrorMovie(String title, int duration, double rating, String[] qarray, MovieType type, Director director, boolean hasJumpScares, String intensity) {
        super(title, duration, rating, qarray, type, director);
        this.hasJumpScares = hasJumpScares;
        this.intensity = intensity;
    }

    void play() {
        System.out.println("Playing horror movie " + title);
    }

    void stop() {
        System.out.println("Stopping horror movie " + title);
    }

    void showIntensity() {
        System.out.println("Intensity: " + intensity);
    }

    public String toString() {
        return "HorrorMovie{hasJumpScares=" + hasJumpScares +
                ", intensity='" + intensity + "'} " + super.toString();
    }
}
