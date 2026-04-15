package com.xworkz.override.actor;

public class Agency {

    String name;
    String location;

    Agency(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return "Agency{name='" + name + "', location='" + location + "'}";
    }
}
