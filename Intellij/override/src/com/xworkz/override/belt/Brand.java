package com.xworkz.override.belt;

public class Brand {

    String name;
    String country;

    Brand(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String toString() {
        return "Brand{name='" + name + "', country='" + country + "'}";
    }
}
