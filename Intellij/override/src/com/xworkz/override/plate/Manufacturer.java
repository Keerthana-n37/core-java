package com.xworkz.override.plate;

public class Manufacturer {

    String name;
    String city;

    Manufacturer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return "Manufacturer{name='" + name + "', city='" + city + "'}";
    }
}
