package com.xworkz.override.dollar;

public class GoldDollar extends Dollar {

    int length;
    double price;
    boolean isLuxury;

    GoldDollar(String symbol, String material, String[] engravings,
                       DollarMaterial materialName, Designer designer,
                       int length, double price, boolean isLuxury) {

        super(symbol, material, engravings,materialName, designer);
        this.length = length;
        this.price = price;
        this.isLuxury = isLuxury;
    }

    @Override
    void shine() {
        System.out.println("Gold Dollar Ornament is shining brightly");
    }

    @Override
    void polish() {
        System.out.println("Gold Dollar Ornament is polished carefully");
    }

    void showDetails() {
        System.out.println("Length: " + length);
        System.out.println("Price: " + price);
        System.out.println("Luxury: " + isLuxury);
    }

    public String toString() {
        return "GoldDollarOrnament{length=" + length + ", price=" + price + ", isLuxury=" + isLuxury + "} " + super.toString();
    }

}
