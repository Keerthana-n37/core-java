package com.xworkz.override.movie;

public class MovieRunner {
    public static void main(String[] args) {


        String[] qarray = {"Hit", "HD", "Dolby"};

        Director d = new Director("Rajamouli", "India");

        Movie movie = new Movie("RRR", 180, 9.0, qarray, MovieType.ACTION, d);
        HorrorMovie horror = new HorrorMovie("Kanchana", 170, 8.8, qarray, MovieType.ACTION, d, true, "Telugu");

        movie.play();
        movie.stop();
        System.out.println(movie);

        horror.play();
        horror.stop();
        horror.showIntensity();
        System.out.println(horror);
    }
}

