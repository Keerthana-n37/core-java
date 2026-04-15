package com.xworkz.override.Information;

public class Source {

    String name;
    String location;

    Source(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return "Source{name='" + name + "', location='" + location + "'}";
    }
}
