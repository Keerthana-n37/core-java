package com.xworkz.override.jail;

public class Prisoner {

    String name;
    int age;

    Prisoner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Prisoner{name='" + name + "', age=" + age + "}";
    }

}
