package com.xworkz.override.medicalshop;

public class MedicalShopRunner {


    public static void main(String[] args) {
        String[] medicines = {"Paracetamol", "Dolo", "Aspirin"};

        Owner owner = new Owner("Ravi", "Bangalore");

        MedicalShop medicalShop = new MedicalShop("HealthCare", 12345, 50000.0, medicines, ShopType.RETAIL, owner);
        Pharmacy pharmacy = new Pharmacy("Apollo", 67890, 80000.0, medicines, ShopType.CLINIC, owner, true, "General");

        medicalShop.openShop();
        medicalShop.closeShop();
        System.out.println(medicalShop);

        pharmacy.openShop();
        pharmacy.closeShop();
        pharmacy.showSpecialization();
        System.out.println(pharmacy);
    }
}


