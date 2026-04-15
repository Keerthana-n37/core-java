package com.xworkz.override.movie;

public class Director {

    String name;
    String country;

    Director(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String toString() {
        return "Director{name='" + name + "', country='" + country + "'}";
    }
}
