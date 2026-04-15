package com.xworkz.override.slipper;

public class Manufacturer {

    String name;
    String country;

    Manufacturer(String name,String country)
    {
        this.name=name;
        this.country=country;
    }

    void display()
    {
        System.out.println("Executing display method in Manufacturer");
        System.out.println("Manufacturer name:"+name+"country:"+country);
    }
}
