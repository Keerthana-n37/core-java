package com.xworkz.override.helmet;

public class SafetyHelmet  extends Helmet{

    boolean isISIApproved;
    String material;

    SafetyHelmet(String brand, int size, double price, String[] features, HelmetType type, Company company, boolean isISIApproved, String material) {
        super(brand, size, price, features, type, company);
        this.isISIApproved = isISIApproved;
        this.material = material;
    }

    void wear() {
        System.out.println("Wearing safety helmet");
    }

    void remove() {
        System.out.println("Removing safety helmet");
    }

    void showMaterial() {
        System.out.println("Material: " + material);
    }

    public String toString() {
        return "SafetyHelmet{isISIApproved=" + isISIApproved + ", material='" + material + "'} " + super.toString();
    }
}
