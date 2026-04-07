package com.xwork.task1.medical;

public class MedicalRunner {


    public static void main(String[] args)
    {
        Medical[] medicalArray = new Medical[5];
        StoreMedical storeMedical = new StoreMedical(medicalArray);

        Medical medical1 = new Medical();
        medical1.medicineId = 1;
        medical1.name = "Paracetamol";
        medical1.price = 20;
        medical1.expiryDate = "2027";
        medical1.company = "Cipla";

        Medical medical2 = new Medical();
        medical2.medicineId = 2;
        medical2.name = "Dolo";
        medical2.price = 30;
        medical2.expiryDate = "2026";
        medical2.company = "Micro Labs";

        Medical medical3 = new Medical();
        medical3.medicineId = 3;
        medical3.name = "Crocin";
        medical3.price = 25;
        medical3.expiryDate = "2028";
        medical3.company = "GSK";

        System.out.println("Storing the medical details");
        storeMedical.storeMedical(medical1);
        storeMedical.storeMedical(medical2);
        storeMedical.storeMedical(medical3);

        System.out.println("Search by medicine name");
        storeMedical.searchByName("Dolo");

        System.out.println("Update medicine name");
        storeMedical.update("Crocin", "Crocin Advance");
    }
}
