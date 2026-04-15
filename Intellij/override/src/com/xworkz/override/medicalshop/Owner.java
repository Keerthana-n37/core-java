package com.xworkz.override.medicalshop;

public class Owner {

    String name;
    String city;

    Owner(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return "Owner{name='" + name + "', city='" + city + "'}";
    }
}
