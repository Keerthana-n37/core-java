package com.xworkz.override.belt;

import java.util.Arrays;

public class Belt {

    String color;
    int size;
    double price;
    char[] codes;
    BeltStyle style;
    Brand brand;

    Belt(String color, int size, double price, char[] codes, BeltStyle style, Brand brand) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.codes = codes;
        this.style = style;
        this.brand = brand;
    }

    void wear() {
        System.out.println("Wearing belt");
    }

    void remove() {
        System.out.println("Removing belt");
    }

    public String toString() {
        return "Belt{color='" + color + "', size=" + size + ", price=" + price + ", codes=" + Arrays.toString(codes) + ", style=" + style + ", brand=" + brand + "}";
    }
}
