package com.xworkz.override.stitch;

public class Tailor {

    String name;
    int experience;

    Tailor(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String toString() {
        return "Tailor{name='" + name + "', experience=" + experience + "}";
    }
}
