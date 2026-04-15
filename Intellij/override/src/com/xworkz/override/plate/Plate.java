package com.xworkz.override.plate;

import java.util.Arrays;

public class Plate {

    String color;
    int diameter;
    double price;
    String[] plateMaterial;;
    PlateMaterial material;
    Manufacturer manufacturer;

    Plate(String color, int diameter, double price, String[] plateMaterial, PlateMaterial material, Manufacturer manufacturer) {
        this.color = color;
        this.diameter = diameter;
        this.price = price;
        this.plateMaterial = plateMaterial;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    void use() {
        System.out.println("Using plate");
    }

    void clean() {
        System.out.println("Cleaning plate");
    }

    public String toString() {
        return "Plate{color='" + color + "', diameter=" + diameter + ", price=" + price + ", codes=" + Arrays.toString(plateMaterial) + ", material=" + material + ", manufacturer=" + manufacturer + "}";
    }
}
