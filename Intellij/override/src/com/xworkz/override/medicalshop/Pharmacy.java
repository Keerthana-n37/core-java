package com.xworkz.override.medicalshop;

public class Pharmacy extends MedicalShop {

    boolean is24Hours;
    String specialization;

    Pharmacy(String shopName, int licenseNumber, double revenue, String[] medicines, ShopType type, Owner owner, boolean is24Hours, String specialization) {
        super(shopName, licenseNumber, revenue, medicines, type, owner);
        this.is24Hours = is24Hours;
        this.specialization = specialization;
    }

    void openShop() {
        System.out.println("Pharmacy " + shopName + " is open");
    }

    void closeShop() {
        System.out.println("Pharmacy " + shopName + " is closed");
    }

    void showSpecialization() {
        System.out.println("Specialization: " + specialization);
    }

    public String toString() {
        return "Pharmacy{is24Hours=" + is24Hours +
                ", specialization='" + specialization + "'} " + super.toString();
    }
}
