package com.xworkz.override.concert;

public class Organizer {

    String name;
    String city;

    Organizer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return "Organizer{name='" + name + "', city='" + city + "'}";
    }
}

