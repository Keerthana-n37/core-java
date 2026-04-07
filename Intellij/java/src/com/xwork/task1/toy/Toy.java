package com.xwork.task1.toy;

public class Toy {

    int serialNumber;
    String theme;
    String material;
    int ageLimit;
    String certificationTag;

    Toy()
    {
        this.serialNumber=serialNumber;
        this.theme=theme;
        this.material=material;
        this.ageLimit = ageLimit;
        this.certificationTag = certificationTag;
    }


    void displayToy()
    {
        System.out.println("Executing displayToy in Toy ");
        System.out.println("Serial number of toy: "+this.serialNumber);
        System.out.println("theme of toy: "+this.theme);
        System.out.println("Age limit for toy: "+this.ageLimit);
        System.out.println("certification tag of toy:"+this.certificationTag);
    }

}
