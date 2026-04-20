package com.xworkz.tostringandequals.diamond;

public class DiamondRunner {
    public static void main(String[] args)
    {
        Diamond diamond1 = new Diamond("White", 1.5, 50000);
        Diamond diamond2 = new Diamond("Yellow", 2.0, 60000);
        Diamond diamond3 = new Diamond("White", 1.7, 50000);

        System.out.println(diamond1);
        System.out.println(diamond2);
        System.out.println(diamond3);

        boolean check = diamond1.equals(diamond3);
        System.out.println("check = " + check);
    }
}
