package com.xworkz.override.actor;

import java.util.Arrays;

public class Actor {

    String name;
    int age;
    double salary;
    int[] scores;
    ActorType type;
    Agency agency;

    Actor(String name, int age, double salary, int[] scores, ActorType type, Agency agency) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.scores = scores;
        this.type = type;
        this.agency = agency;
    }

    void act() {
        System.out.println("Actor " + name + " is acting");
    }

    void rest() {
        System.out.println("Actor " + name + " is resting");
    }

    public String toString() {
        return "Actor{name='" + name + "', age=" + age + ", salary=" + salary + ", scores=" + Arrays.toString(scores) + ", type=" + type + ", agency=" + agency + "}";
    }
}
