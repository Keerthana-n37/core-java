package com.xworkz.override.medicalshop;

import java.util.Arrays;

public class MedicalShop {

    String shopName;
    int licenseNumber;
    double revenue;
    String[] medicines;
    ShopType type;
    Owner owner;

    MedicalShop(String shopName, int licenseNumber, double revenue, String[] medicines, ShopType type, Owner owner) {
        this.shopName = shopName;
        this.licenseNumber = licenseNumber;
        this.revenue = revenue;
        this.medicines = medicines;
        this.type = type;
        this.owner = owner;
    }

    void openShop() {
        System.out.println("Medical shop " + shopName + " is open");
    }

    void closeShop() {
        System.out.println("Medical shop " + shopName + " is closed");
    }

    public String toString() {
        return "MedicalShop{shopName='" + shopName + "', licenseNumber=" + licenseNumber + ", revenue=" + revenue + ", medicines=" + Arrays.toString(medicines) + ", type=" + type + ", owner=" + owner + "}";
    }
}
