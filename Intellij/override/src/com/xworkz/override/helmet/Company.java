package com.xworkz.override.helmet;

public class Company {

    String name;
    String country;

    Company(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String toString() {
        return "Company{name='" + name + "', country='" + country + "'}";
    }
}
