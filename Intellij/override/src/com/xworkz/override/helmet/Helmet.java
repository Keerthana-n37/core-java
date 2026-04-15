package com.xworkz.override.helmet;

import java.util.Arrays;

public class Helmet {

    String brand;
    int size;
    double price;
    String[] features;
    HelmetType type;
    Company company;

    Helmet(String brand, int size, double price, String[] features, HelmetType type, Company company) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.features = features;
        this.type = type;
        this.company = company;
    }

    void wear() {
        System.out.println("Wearing helmet");
    }

    void remove() {
        System.out.println("Removing helmet");
    }

    public String toString() {
        return "Helmet{brand='" + brand +
                "', size=" + size +
                ", price=" + price +
                ", qarray=" + Arrays.toString(features) +
                ", type=" + type +
                ", company=" + company +
                "}";
    }
}
