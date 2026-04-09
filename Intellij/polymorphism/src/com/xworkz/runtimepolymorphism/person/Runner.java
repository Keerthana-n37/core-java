package com.xworkz.runtimepolymorphism.person;

public class Runner {

    public static void main(String[] args) {
        Developer developer= new Developer();
        developer.doWork();

        Person person = new Person();
        person.doWork();
    }
}
