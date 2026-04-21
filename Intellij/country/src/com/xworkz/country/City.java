package com.xworkz.country;

public class City {

    String name;
    int noOfDistricts;
    District[] districts;

    City(String name,int noOfDistricts,District[] districts)
    {
        this.name=name;
        this.noOfDistricts=noOfDistricts;
        this.districts=districts;
    }
}
