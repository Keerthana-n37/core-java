package com.xworkz.override.slipper;

public class Slipper {

    int size;
    String color;
    double price;
    String[] features;
    Brand brand;
    Manufacturer manufacturer;

    Slipper(int size,String color,double price,String[] features,Brand brand,Manufacturer manufacturer)
    {
        this.size=size;
        this.color=color;
        this.price=price;
        this.features=features;
        this.brand=brand;
        this.manufacturer=manufacturer;
    }

    void wear()
    {
        System.out.println("Wearing slipper");
    }

    void remove()
    {
        System.out.println("Executing remove method in Slipper");
    }

    public String toString()
    {
        return "Slipper details:"+"size:"+size+",color:"+color+",price:"+price+",brand:"+brand+",manufacturer:"+manufacturer;
    }
}
