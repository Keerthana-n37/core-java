package com.xwork.task1.toy;

public class ToyRunner {

    public static void main(String[] args)
    {
        Toy[] toyArray = new Toy[5];
        StoreToy storeToy= new StoreToy(toyArray);

        Toy toy1 = new Toy();
        toy1.serialNumber=200;
        toy1.theme="Car";
        toy1.material="Plastic";
        toy1.ageLimit= 5;
        toy1.certificationTag= "ISO";


        Toy toy2 = new Toy();
        toy2.serialNumber=201;
        toy2.theme="Doll";
        toy2.material="Fiber";
        toy2.ageLimit= 6;
        toy2.certificationTag= "ISI";

        Toy toy3 = new Toy();
        toy3.serialNumber=202;
        toy3.theme="Robot";
        toy3.material="Metal";
        toy3.ageLimit= 8;
        toy3.certificationTag= "BIS";

        System.out.println("Storing the toy details");
        storeToy.storeToy(toy1);
        storeToy.storeToy(toy2);
        storeToy.storeToy(toy3);

        System.out.println("Search by theme");
        storeToy.searchByTheme("Car");

        System.out.println("Update by theme");
        storeToy.update("Robot","AI Robot");
    }
}
