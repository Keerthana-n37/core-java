package com.xworkz.override.dollar;

public class DollarRunner {


    public static void main(String[] args) {

        String[] engravings = {"Golden $ Symbol", "Royal Mark", "Luxury Stamp"};

        Designer designer = new Designer("Armani", "Luxury House");

        Dollar dollar = new Dollar("Ganesha idol", "Gold", engravings, DollarMaterial.GOLD, designer);
        dollar.shine();
        dollar.polish();
        System.out.println(dollar);

        GoldDollar goldDollar = new GoldDollar("name locket", "Gold", engravings, DollarMaterial.GOLD, designer, 20, 50000.0, true);

        goldDollar.shine();
        goldDollar.polish();
        goldDollar.showDetails();
        System.out.println(goldDollar);
    }
}
